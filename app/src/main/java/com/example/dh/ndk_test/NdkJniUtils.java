package com.example.dh.ndk_test;

/**
 * Created by dh on 2016/6/26.
 */
public class NdkJniUtils {
    public native String getCLanguageString();

    static {
        System.loadLibrary("YanboberJniLibName");	//defaultConfig.ndk.moduleName
    }
}
