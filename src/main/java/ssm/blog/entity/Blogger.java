package ssm.blog.entity;

public class Blogger {
    private Integer id;
    private String username;//用户名
    private String password;//密码
    private String profile;//博主信息
    private String nickname;//博主昵称
    private String sign;//博主签名
    private String imagename;//图片路径
    public Blogger(String username,String password,String profile,String nickname,String sign,String imagename){
            this.imagename=imagename;
            this.nickname=nickname;
            this.password=password;
            this.profile=profile;
            this.sign=sign;
            this.username=username;
    }
    public Blogger(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getImagename() {
        return imagename;
    }

    public void setImagename(String imagename) {
        this.imagename = imagename;
    }

    @Override
    public String toString() {
        return "Blogger{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", profile='" + profile + '\'' +
                ", nickname='" + nickname + '\'' +
                ", sign='" + sign + '\'' +
                ", imagename='" + imagename + '\'' +
                '}';
    }
}
