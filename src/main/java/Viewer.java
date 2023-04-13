public class Viewer {
    private String nickname;
    private int age;
    private String[] moviesWatched;

    public Viewer(String nickname, int age, String[] moviesWatched) {
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

    public String[] getMoviesWatched() {
        return moviesWatched;
    }

    public void setMoviesWatched(String[] moviesWatched) {
        this.moviesWatched = moviesWatched;
    }
}
