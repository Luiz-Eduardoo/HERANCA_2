// classe com os atributos comuns em todas as outras classes
	class InfoComum {
		// Atributos comuns
		private String cargo;
		private String nome;
		private String cpf;
		private String data_nasc;
		// metodo construtor para montar as caracteristicas
		public InfoComum(String cargo, String nome, String cpf, String data_nasc) {
			this.cargo = cargo;
			this.nome = nome;
			this.cpf = cpf;
			this.data_nasc = data_nasc;
		}
		// método get para acessar o atributo
		public String getNome() {
			return nome;
		}
		// método set para modificar o valor do atributo
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getData_nasc() {
			return data_nasc;
		}
		public void setData_nasc(String data_nasc) {
			this.data_nasc = data_nasc;
		}
		// metodo para retornar as informações formatadas
		public String descricao() {
			return " " + cargo + "\n Nome: " + nome + "\n CPF: " + cpf + " \n Data de nascimento: " + data_nasc;
		}
	}
	// classe Vendedor com os atributos específicos necessários
	class Vendedor extends InfoComum {
		// Atributos específicos
		private String datacontratacao;
		private float Salariobase;
		private double percentualcomissao;
		// metodo construtor para montar as caracteristicas
		public Vendedor(String cargo, String nome, String cpf, String data_nasc, String datacontratacao, float Salariobase, double percentualcomissao) {
			super (cargo, nome, cpf, data_nasc);
			this.datacontratacao = datacontratacao;
			this.Salariobase = Salariobase;
			this.percentualcomissao = percentualcomissao;
		}
		// método get para acessar o atributo
		public String getDatacontratacao() {
			return datacontratacao;
		}
		// método set para modificar o valor do atributo
		public void setDatacontratacao(String datacontratacao) {
			this.datacontratacao = datacontratacao;
		}

		public float getSalariobase() {
			return Salariobase;
		}
		public void setSalariobase(float salariobase) {
			Salariobase = salariobase;
		}
		public double getPercentualcomissao() {
			return percentualcomissao;
		}
		public void setPercentualcomissao(double percentualcomissao) {
			this.percentualcomissao = percentualcomissao;
		}
		// metodo para retornar as informações formatadas
		public String descricao() {
			// "super" para pegar as informaçoes formatadas da classe InfoComum e adicionar as informações especificas dessa classe
			return super.descricao() + "\n Data de contratação: " + datacontratacao + "\n Salario Base: " + Salariobase + "\n Percentual de Comissão: " + percentualcomissao + "%";
		}
	}
	// classe Gerente com os atributos específicos necessários
	class Gerente extends InfoComum {
		// Atributos específicos
		private String datacontratacao;
		private float Salariobase;
		private String departamento;
		// metodo construtor para montar as caracteristicas
		public Gerente(String cargo, String nome, String cpf, String data_nasc, String datacontratacao, float Salariobase, String departamento) {
	        super(cargo, nome, cpf, data_nasc);
	        this.datacontratacao = datacontratacao;
	        this.Salariobase = Salariobase;
	        this.departamento = departamento;
	    }
		// método get para acessar o atributo
		public String getDatacontratacao() {
			return datacontratacao;
		}
		// método set para modificar o valor do atributo
		public void setDatacontratacao(String datacontratacao) {
			this.datacontratacao = datacontratacao;
		}

		public float getSalariobase() {
			return Salariobase;
		}
		public void setSalariobase(float salariobase) {
			Salariobase = salariobase;
		}
		public String getDepartamento() {
			return departamento;
		}
		public void setDepartamento(String departamento) {
			this.departamento = departamento;
		}
		// metodo para retornar as informações formatadas
		public String descricao() {
			// "super" para pegar as informaçoes formatadas da classe InfoComum e adicionar as informações especificas dessa classe
			return super.descricao() +  "\n Data de contratação: " + datacontratacao + "\n Salario base: " + Salariobase + "\n Departamento: " + departamento;
		}
	}
	// classe Cliente com os atributos específicos necessários
	class Cliente extends InfoComum {
		// Atributos específicos
		private String email;
		private String numcartao;
		private String telefone;
		// metodo construtor para montar as caracteristicas
		public Cliente(String cargo, String nome, String cpf, String data_nasc, String email, String numcartao, String telefone) {
	        super(cargo, nome, cpf, data_nasc);
	        this.email = email;
	        this.numcartao = numcartao;
	        this.telefone = telefone;
	    }
		// método get para acessar o atributo
		public String getEmail() {
			return email;
		}
		// método set para modificar o valor do atributo
		public void setEmail(String email) {
			this.email = email;
		}
		public String getNumcartao() {
			return numcartao;
		}
		public void setNumcartao(String numcartao) {
			this.numcartao = numcartao;
		}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		// metodo para retornar as informações formatadas
		public String descricao() {
			// "super" para pegar as informaçoes formatadas da classe InfoComum e adicionar as informações especificas dessa classe
			return super.descricao() + "\n E-mail: " + email + "\n Número do cartão: " + numcartao + " \n Telefone: " + telefone;
		}
	}
public class Herança_2 {
	public static void main(String[] args) {
		// criando novo objeto dando valor aos atributos
		Vendedor v1 = new Vendedor("Vendedor", "Jeferson", "123.456.789.01", "07/12/2005", "01/02/2024", 3650f, 10);
		Gerente v2 = new Gerente("Gerente", "David", "098.765.432.10", "31/01/1997", "05/03/2023", 7689f, "Imóveis");
		Cliente v3 = new Cliente("Cliente","Henrique", "123.098.456.87", "15/01/1969", "henriquesilverio@outlook.com", "1234 5678 9012 5643", "3234-9876");
		// imprimindo as informações formatadas de cada objeto
		System.out.println(v1.descricao());
		System.out.println(" ");
		System.out.println(v2.descricao());
		System.out.println(" ");
		System.out.println(v3.descricao());
	}
}