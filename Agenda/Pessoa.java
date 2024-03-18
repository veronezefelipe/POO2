package vero.ifc;

class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private String sobrenome;
    private String dataNascimento;
    private String telefone;

    public Pessoa(String nome, String sobrenome, String dataNascimento, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public int compareTo(Pessoa outraPessoa) {
        int comparacaoNome = this.nome.compareTo(outraPessoa.getNome());
        if (comparacaoNome != 0) {
            return comparacaoNome;
        }

        int comparacaoSobrenome = this.sobrenome.compareTo(outraPessoa.getSobrenome());
        if (comparacaoSobrenome != 0) {
            return comparacaoSobrenome;
        }

        return this.dataNascimento.compareTo(outraPessoa.getDataNascimento());
    }

    @Override
    public String toString() {
        return nome + " " + sobrenome + " (Data de Nascimento: " + dataNascimento + ", Telefone: " + telefone + ")";
    }

}