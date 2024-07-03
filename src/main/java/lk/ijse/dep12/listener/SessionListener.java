package lk.ijse.dep12.listener;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

//@WebListener
public class SessionListener implements HttpSessionListener {

    static {
        System.out.println("1. SessionListener class object is being initialized");
        System.out.println("Thread : "+Thread.currentThread().getName());
    }

    public SessionListener() {
        System.out.println("2. Singleton SessionListener()");
        System.out.println("Thread : "+Thread.currentThread().getName());
        System.out.println("======================================");

    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("3. SessionListener session has just been Created");
        System.out.println("Thread : "+Thread.currentThread().getName());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("SessionListener session has just been Destroyed");
        System.out.println("Thread : "+Thread.currentThread().getName());
    }
}
