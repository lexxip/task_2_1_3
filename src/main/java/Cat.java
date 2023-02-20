public class Cat {

    private Long id;
    private String nickName;

    public Cat() {

    }

    public Cat(String nickName) {
        this.nickName = nickName;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickName() {
        return this.nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

}
