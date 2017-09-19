package builder;

public class Usuario  
{

    private String nome;
    private String cpf;

	private String dataNascimento;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String informacoes;

    private Usuario(UsuarioBuilder builder)
    {
        this.nome = builder.nome;
        this.cpf = builder.cpf;
        this.dataNascimento = builder.dataNascimento;
        this.endereco = builder.endereco;
        this.bairro = builder.bairro;
        this.cidade = builder.cidade;
        this.estado = builder.estado;
        this.informacoes = builder.informacoes;
    }

    public static class UsuarioBuilder
    {
        private String nome;
        private String cpf;
        private String dataNascimento;
        private String endereco;
        private String bairro;
        private String cidade;
        private String estado;
        private String informacoes;

        public UsuarioBuilder(String nome, String cpf)
        {
            this.nome = nome;
            this.cpf = cpf;
        }

        public UsuarioBuilder dataNascimento(String dataNascimento)
        {
            this.dataNascimento = dataNascimento;
            return this;
        }

        public UsuarioBuilder endereco(String endereco)
        {
            this.endereco = endereco;
            return this;
        }

        public UsuarioBuilder bairro(String bairro)
        {
            this.bairro = bairro;
            return this;
        }

        public UsuarioBuilder cidade(String cidade)
        {
            this.cidade = cidade;
            return this;
        }

        public UsuarioBuilder estado(String estado)
        {
            this.estado = estado;
            return this;
        }

        public UsuarioBuilder informacoes(String informacoes)
        {
            this.informacoes = informacoes;
            return this;
        }

        public Usuario build()
        {
            return new Usuario(this);
        }
    }
    
    public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	public String getInformacoes() {
		return informacoes;
	}
}