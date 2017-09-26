package HomeWork3.enums;

import com.sun.prism.shader.DrawCircle_Color_AlphaTest_Loader;

public enum InputData {
    USER_NAME ("Piter Chailovskii"),
    LOGIN ("epam"),
    PASSWORD("1234"),
    URL("https://jdi-framework.github.io/tests");
    public String inData;

    InputData(String inData) {
        this.inData = inData;
    }

}