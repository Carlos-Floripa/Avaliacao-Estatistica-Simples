public class EstatisticasSimples {
	public static double calculaValorMinimo(double[] valoresDeEntrada){
		double aux=valoresDeEntrada[0];	
		for(int i = 0; i<valoresDeEntrada.length; i++){
			if(aux>=valoresDeEntrada[i]){
				aux=valoresDeEntrada[i];
			}	
		}
		return aux;
	}
	public static double calculaValorMaximo(double[] valoresDeEntrada) {
		double aux=valoresDeEntrada[0];
			for(int i=0; i<valoresDeEntrada.length; i++){
				if(aux<=valoresDeEntrada[i]){
					aux=valoresDeEntrada[i];
				}	
			}
		return aux;	
	}
	public static int calculaQuantidade(double[] valoresDeEntrada) {
		return valoresDeEntrada.length;
	}
	public static double calculaMedia(double[] valoresDeEntrada) {
		double aux=0;
		for(int i=0;i<valoresDeEntrada.length;i++){
			aux=aux+valoresDeEntrada[i];
		}
		return aux=aux/valoresDeEntrada.length;
	}
	public static double[] calcula(double[] valoresDeEntrada) {
		double vetor[]={0,0,0,0};
		vetor[0]=calculaValorMinimo(valoresDeEntrada);
		vetor[1]=calculaValorMaximo(valoresDeEntrada);
		vetor[2]=calculaQuantidade(valoresDeEntrada);
		vetor[3]=calculaMedia(valoresDeEntrada);
		return vetor;
	}
}
