import java.util.Scanner;

class Exercise1 {

  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.println(
      "Digite a hora de inicio e em seguida digite o minuto de inicio: "
    );
    int hora1 = input.nextInt();
    int minuto1 = input.nextInt();
    System.out.println(
      "Digite a hora final e em seguida digite o minuto final: "
    );
    int hora2 = input.nextInt();
    int minuto2 = input.nextInt();
    int horaInicial = (hora1 * 60) + minuto1;
    int horaFinal = (hora2 * 60) + minuto2;
    int duracao = horaFinal - horaInicial;
    int horasInteiras = duracao / 60;
    int minutosInteiros = duracao % 60;

    if (minutosInteiros > 0) {
      System.out.println(
        "O valor é de R$ " +
        calculaCusto(horasInteiras, minutosInteiros) +
        " do tempo de duração de: " +
        horasInteiras +
        " horas e " +
        minutosInteiros +
        " minutos, cobrado o custo de " +
        (horasInteiras + 1) +
        " horas."
      );
    } else {
      System.out.println(
        "O valor é de R$ " +
        calculaCusto(horasInteiras, minutosInteiros) +
        " do tempo de duração de: " +
        horasInteiras +
        " horas e " +
        minutosInteiros
      );
    }
  }

  public static double calculaCusto(int horasInteiras, int minutosInteiros) {
    double valor;
    if (minutosInteiros > 0) {
      horasInteiras++;
    }
    if (horasInteiras > 3) {
      valor = horasInteiras * 90;
      valor = valor * 0.9;
    } else {
      valor = horasInteiras * 90;
    }

    System.out.println("horasInteiras: " + horasInteiras);
    System.out.println("minutosInteiros: " + minutosInteiros);
    System.out.println("valor: " + valor);
    return valor;
  }
}
