
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AgendaContatos agenda = new AgendaContatos();
		agenda.adicionarContato("Rodrigo", 1);
		agenda.adicionarContato("Rodrigo", 2);
		agenda.adicionarContato("Rodrigo", 3);
		agenda.adicionarContato("Rodrigo", 1);
		agenda.exibirContatos();
		agenda.atualizarNumeroContato("Rodrigo", 2);
		agenda.exibirContatos();
	}

}
