public class Duet {
    private Singer singer1;
    private Singer singer2;

    Duet(Singer singer1, Singer singer2) {
        this.singer1 = singer1;
        this.singer2 = singer2;
    }

    public Singer getSinger1() {
        return singer1;
    }

    public Singer getSinger2() {
        return singer2;
    }
    
    public void setSinger1(Singer newSinger) {
        singer1 = newSinger;
    }
    
    public void setSinger2(Singer newSinger) {
        singer2 = newSinger;
    }

    public Boolean bothProfessional() {
        if (singer1.getProfessional() && singer2.getProfessional()) {
            return true;
        }
        else {
            return false;
        }
    }
}
