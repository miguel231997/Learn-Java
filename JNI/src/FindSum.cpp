#include <jni.h>
#include "FindSum.h"

JNIEXPORT jdouble JNICALL Java_FindSum_totalSum(JNIEnv *env, jobject thisObj, jdouble x, jdouble y) {
    return x + y;
}

//JNIEXPORT jdouble JNICALL -> this endures java can call this function properly
//Java_FindSum_totalSum -> JNI requires this exact function name(matching the java class & method

//JNIEnv *env and jobject thisObj -> these help java and C++ communicate

//jdouble x, jdouble y -> mactches javas double parameters


//compile C++ code

//g++ -shared -o libmynativelib.so -I/usr/lib/jvm/default-java/include -I/usr/lib/jvm/default-java/include/linux FindSum.cpp