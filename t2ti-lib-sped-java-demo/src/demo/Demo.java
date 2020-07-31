package demo;

public class Demo {

	public static void main(String[] args) throws Exception {

		// gera sped fiscal
		SpedFiscalService spedFiscal = new SpedFiscalService();
		String filterEFD = "2020-01-01|2020-12-12|0|0|0|1|0|1"; // filtro recebido da aplicação cliente
		System.out.println(spedFiscal.gerarSpedFiscal(filterEFD));

		// gera sped contabil
		SpedContabilService spedContabil = new SpedContabilService();
		String filterECD = "2020-01-01|2020-12-12|0|0"; // filtro recebido da aplicação cliente
		System.out.println(spedContabil.gerarSpedContabil(filterECD));
		
	}

}
