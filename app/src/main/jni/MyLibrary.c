#include <jni.h>

JNIEXPORT jstring JNICALL
                 Java_com_example_androiddemo_MainActivity_getString(JNIEnv *env, jobject instance)
{



    return (*env)->NewStringUTF(env, "for test");
}