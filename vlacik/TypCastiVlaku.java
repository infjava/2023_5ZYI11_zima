public enum TypCastiVlaku {
    RUSEN("vlak"),
    VAGON1("vagon01"),
    VAGON2("vagon02"),
    VAGON3("vagon03");
    
    private String suborObrazka;
    
    TypCastiVlaku(String subor) {
        this.suborObrazka = String.format("pics/%s.png", subor);
    }
    
    public String getSuborObrazka() {
        return this.suborObrazka;
    }
}
