package com.example.springboot.utils;

public class ThreadLocalUtil {
    private static final ThreadLocal THREAD_LOCAL = new ThreadLocal();

    public static <T> T getThreadLocal() {
        return (T) THREAD_LOCAL.get();
    }
    public static void setThreadLocal(Object value){
        THREAD_LOCAL.set(value);
    }

    public static void remove(){
        THREAD_LOCAL.remove();
    }
}
