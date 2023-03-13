public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

}
public class PessoaFisica {
    private String nome;
    private String ultimoNome;
    private String genero;
    private int idade;
    private float cpf;
    private String estadoCivil;
    private float cep;
    

    public PessoaFisica(String nome, String ultimoNome, String genero, int idade, float cpf, String estadoCivil,
            float cep) {
        this.nome = nome;
        this.ultimoNome = ultimoNome;
        this.genero = genero;
        this.idade = idade;
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
        this.cep = cep;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getUltimoNome() {
        return ultimoNome;
    }
    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getCpf() {
        return cpf;
    }
    public void setCpf(float cpf) {
        this.cpf = cpf;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public float getCep() {
        return cep;
    }
    /**
     * @param cep
     */
    public void setCep(float cep) {
    if (cep==8)
        this.cep = cep;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((ultimoNome == null) ? 0 : ultimoNome.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + idade;
        result = prime * result + Float.floatToIntBits(cpf);
        result = prime * result + ((estadoCivil == null) ? 0 : estadoCivil.hashCode());
        result = prime * result + Float.floatToIntBits(cep);
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PessoaFisica other = (PessoaFisica) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (ultimoNome == null) {
            if (other.ultimoNome != null)
                return false;
        } else if (!ultimoNome.equals(other.ultimoNome))
            return false;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        if (idade != other.idade)
            return false;
        if (Float.floatToIntBits(cpf) != Float.floatToIntBits(other.cpf))
            return false;
        if (estadoCivil == null) {
            if (other.estadoCivil != null)
                return false;
        } else if (!estadoCivil.equals(other.estadoCivil))
            return false;
        if (Float.floatToIntBits(cep) != Float.floatToIntBits(other.cep))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "PessoaFisica [nome=" + nome + ", ultimoNome=" + ultimoNome + ", genero=" + genero + ", idade=" + idade
                + ", cpf=" + cpf + ", estadoCivil=" + estadoCivil + ", cep=" + cep + "]";
    }
     
}
