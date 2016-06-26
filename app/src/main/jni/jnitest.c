//
// Created by dh on 2016/6/26.
//
#include "com_example_dh_ndk_test_NdkJniUtils.h"
JNIEXPORT jstring JNICALL Java_com_example_dh_ndk_1test_NdkJniUtils_getCLanguageString
  (JNIEnv *env, jobject obj){
     return (*env)->NewStringUTF(env,"This just a test for Android Studio NDK JNI developer!");
  }