package com.mycompany.app;


/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello" );
    }

    public void foo(  )
    {
        for ( int i = 0; i < 10; i++ )
        { // only references 'i'

            for ( int k = 0; k < 20; i++ )
            { // references both 'i' and 'k'
                System.out.println( "Hello" );
            }
        }
    }
}
