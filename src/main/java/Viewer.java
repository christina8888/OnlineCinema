public class Viewer {
    private String nickname;
    private int age;
    private Cinema[] moviesWatched;

    public Viewer(String nickname, int age, Cinema[] moviesWatched) {
        this.nickname = nickname;
        this.age = age;
        this.moviesWatched = moviesWatched;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cinema[] getMoviesWatched() {
        return moviesWatched;
    }

    public void setMoviesWatched(Cinema[] moviesWatched) {
        this.moviesWatched = moviesWatched;
    }
}
