package ntu.nguyenhoangphuc;

public class Lab5_Bai4_Card {
	private int giaTri;
    private boolean daLat;
    private boolean daTimThayCap;

    public Lab5_Bai4_Card(int giaTri) {
        this.giaTri = giaTri;
        this.daLat = false;
        this.daTimThayCap = false;
    }

    public int getGiaTri() { return giaTri; }

    public boolean isDaLat() { return daLat; }
    public void setDaLat(boolean daLat) { this.daLat = daLat; }

    public boolean isDaTimThayCap() { return daTimThayCap; }
    public void setDaTimThayCap(boolean daTimThayCap) { this.daTimThayCap = daTimThayCap; }

}
