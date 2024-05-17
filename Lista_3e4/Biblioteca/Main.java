package Lista_3e4.Biblioteca;


class ItemBiblioteca {
    private String titulo;

    public ItemBiblioteca(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
}


class Livro extends ItemBiblioteca {
    private String situacao;

    public Livro(String titulo) {
        super(titulo);
        this.situacao = "disponível";
    }

    public String getSituacao() {
        return situacao;
    }

    public void emprestar(Biblioteca biblioteca) {
        if (situacao.equals("disponível")) {
            situacao = "emprestado";
            biblioteca.removerItem(this);
            System.out.println(getTitulo() + " emprestado com sucesso.");
        } else {
            System.out.println(getTitulo() + " não está disponível para empréstimo no momento.");
        }
    }

    public void devolver(Biblioteca biblioteca) {
        situacao = "disponível";
        biblioteca.adicionarItem(this);
    }
}


class Periodico extends ItemBiblioteca {
    private int numeroVolume;

    public Periodico(String titulo, int numeroVolume) {
        super(titulo);
        this.numeroVolume = numeroVolume;
    }

    public int getNumeroVolume() {
        return numeroVolume;
    }
}


class Biblioteca {
    private ItemBiblioteca[] itens;
    private int numItens;

    public Biblioteca(int tamanhoMaximo) {
        itens = new ItemBiblioteca[tamanhoMaximo];
        numItens = 0;
    }

    public void removerItem(ItemBiblioteca item) {
        for (int i = 0; i < numItens; i++) {
            if (itens[i].equals(item)) {
                for (int j = i; j < numItens - 1; j++) {
                    itens[j] = itens[j + 1];
                }
                itens[numItens - 1] = null;
                numItens--;
                System.out.println(item.getTitulo() + " removido da biblioteca.");
                return;
            }
        }
        System.out.println("O item não foi encontrado na biblioteca.");
    }

    public void adicionarItem(ItemBiblioteca item) {
        if (numItens < itens.length) {
            itens[numItens] = item;
            numItens++;
        } else {
            System.out.println("A biblioteca está cheia, não é possível adicionar mais itens.");
        }
    }

    public void listarItens() {
        System.out.println("Itens na biblioteca:");
        for (int i = 0; i < numItens; i++) {
            if (itens[i] instanceof Livro) {
                Livro livro = (Livro) itens[i];
                System.out.println(livro.getTitulo() + " - Situação: " + livro.getSituacao());
            } else if (itens[i] instanceof Periodico) {
                Periodico periodico = (Periodico) itens[i];
                System.out.println(periodico.getTitulo() + " - Volume: " + periodico.getNumeroVolume());
            }
        }
    }

    public ItemBiblioteca buscarItem(String titulo) {
        for (int i = 0; i < numItens; i++) {
            if (itens[i].getTitulo().equals(titulo)) {
                return itens[i];
            }
        }
        return null;
    }
}


public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(10); // Criando uma biblioteca com espaço para 10 itens

        Livro livro1 = new Livro("Use a cabeca JAVA");
        Livro livro2 = new Livro("Estrutura de dados");


        biblioteca.adicionarItem(livro1);
        biblioteca.adicionarItem(livro2);


        biblioteca.listarItens();

        Livro livroEmprestado = (Livro) biblioteca.buscarItem("Estrutura de dados");
        if (livroEmprestado != null) {
            livroEmprestado.emprestar(biblioteca);
        }

        biblioteca.listarItens();

 
        if (livroEmprestado != null) {
            livroEmprestado.devolver(biblioteca);
        }

        biblioteca.listarItens();
    }
}
