
interface Playable {

    void play();
}

class Football implements Playable {

    
        void play{
        System.out.println("Playing Footballll");
    }
}

class Volleyball implements Playable {

    
        void play{
        System.out.println("Playing Volleyball");
    }
}

class Basketball implements Playable {

    
        void play{
        System.out.println("Playing BAsketball");
    }
}

public class Question25 {

    public static void main(String[] args) {
        System.out.println("Name: Sumanth D  , Roll.no : 24325");
        Football f = new Football();
        Volleyball v = new Volleyball();
        Basketball b = new Basketball();
        f.play();
        v.play();
        b.play();
    }
}
