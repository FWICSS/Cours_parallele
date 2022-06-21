class ListeTab {
    private String[] tab = new String[50];
    private int index = 0;
    public void syncrhonizedajoute(String s) {
        tab[index] = s;
        index++;
    }
}
