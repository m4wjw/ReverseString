package com.Sam;

import com.sun.management.VMOption;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.ResultTreeType;

import java.util.Base64;

public class ReverseStr2ACSII {
    public void setO(String o) {
        this.o = o;
    }
    final static private String ERROR = "ERROR";

    public String o = new String();

    private StringBuffer getString(String str) {
        o=str;
        StringBuffer material = new StringBuffer(o).reverse();
        return material;
    }


    /*
    获得打散字符串成为byte数组
    遍历数组，拼接为字符串
    输出字符串
     */
    private String ToASCII(StringBuffer str) {
        String component = new String(str);
        byte[] component1 = component.getBytes();
        int len = component1.length;
        String origin = "";
        for (int i = 0; i < len; i++) {
            origin = origin + component1[i];
        }
        System.out.println(origin);
        return origin;
    }

    private String ToBase64(String str) {
        byte[] component1 = str.getBytes();
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] data = encoder.encode(component1);
        String result = new String(data);
        return result;
    }

    public String RunIt(){
        if("".equals(o)){
            return ERROR;
        }else {
            String data = ToBase64(ToASCII(getString(o)));
            return data;
        }
    }
}
