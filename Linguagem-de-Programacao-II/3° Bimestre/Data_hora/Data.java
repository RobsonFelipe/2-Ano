/* Esta classe faz parte do pacote DataHora */
package DataHora;

/**
 * A classe Data encapsula os dados de uma data qualquer e que faz parte do 
 * pacote DataHora. 
 */
public class Data
  {
 // Declaração dos campos da classe.
 /**
  * Este campo representa o dia de uma instância de Data
  */
  byte dia;
 /**
  * Este campo representa o mês de uma instância de Data
  */
  byte mês;
 /**
  * Este campo representa o ano de uma instância de Data
  */
  short ano;

 /** 
  * O construtor da classe, que recebe argumentos para inicializar os campos da 
  * classe. Note que o construtor é declarado como sendo público, caso contrário
  * ele não poderá ser chamado de fora do pacote !
  * Nenhuma verificação é feita nos valores, para manter o exemplo simples.
  * @param d o dia a ser encapsulado por uma instância desta classe
  * @param m o mês a ser encapsulado por uma instância desta classe
  * @param a o ano a ser encapsulado por uma instância desta classe
  */
  public Data(byte d,byte m,short a)
    {
    dia = d; mês = m; ano = a;
    }
 /**
  * O método éIgual recebe uma instância da própria classe Data como argumento e
  * verifica se a data representada pela classe e pela instância que foi passada é
  * a mesma. A comparação é feita comparando os campos da data um a um.
  * @param outraData uma instância da própria classe Data
  * @return true se a data encapsulada for igual à passada, false caso contrário
  */
  public boolean éIgual(Data outraData)
  {
  if ((dia == outraData.dia) &&    // se os dois dias forem iguais E
  (mês == outraData.mês) &&    // se os dois meses forem iguais E
  (ano == outraData.ano))      // se os dois anos forem iguais então
  return true;      // a data é igual, retorna true
  else
  return false;     // a data é diferente, retorna false
  } // fim do método éIgual
    
 /** 
  * O método toString, que retorna uma string contendo os campos desta classe,
  * formatados de forma adequada.
  * @return uma string com os valores dos campos desta classe
  */
  public String toString()
    {
    return dia+"/"+mês+"/"+ano;
    }

  } // fim da classe Data
