package lk.ijse.dep12.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;

//@WebListener
public class RequestListener implements ServletRequestListener {

    static {
        System.out.println("1. RequestListener class object is being initialized");
        System.out.println("Thread : "+Thread.currentThread().getName());
    }

    public RequestListener() {
        System.out.println("2. Singleton RequestListener()");
        System.out.println("Thread : "+Thread.currentThread().getName());
        System.out.println("======================================");

    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("Servlet request has been just destroyed");
        System.out.println("Thread : "+Thread.currentThread().getName());
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("3. Servlet request has been just initialized");
        System.out.println("Thread : "+Thread.currentThread().getName());
    }
}
