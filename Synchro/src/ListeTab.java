class ListeTab extends Thread{
    private String[] tab = new String[50];
    private int index = 0;
    public synchronized void ajoute(String s) {
        tab[index] = s;
        index++;
    }
}
