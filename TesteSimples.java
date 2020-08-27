class TesteSimples{

  public void executar(){
    Atleta atleta = new Atleta();
    atleta.setNome  ("Tarcisio");
    atleta.setIdade  (29);
    
    System.out.println("nome = " + atleta.getNome());
    System.out.println("Idade = " + atleta.getIdade());
  }
}