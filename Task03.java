package Lab11_Tasks;

public class Task03<T, U> {
    private T username;
    private U password;

    public Task03(T username, U password) {
        this.username = username;
        this.password = password;
    }

    public boolean validate(T inputUser, U inputPass) {
        return username.equals(inputUser) && password.equals(inputPass);
    }
}