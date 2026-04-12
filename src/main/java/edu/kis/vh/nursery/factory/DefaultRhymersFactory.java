package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

/**
 * Domyślna implementacja fabryki wyliczanek (Rhymers).
 * Klasa ta dostarcza standardowe instancje różnych typów wyliczanek
 * wykorzystywanych w aplikacji, zgodnie z wzorcem projektowym Abstract Factory.
 */
public class DefaultRhymersFactory implements Rhymersfactory {

    /**
     * Tworzy i zwraca standardową instancję wyliczanki.
     *
     * @return Nowy obiekt typu DefaultCountingOutRhymer.
     */
    @Override
    public DefaultCountingOutRhymer getStandardRhymer() {
        return new DefaultCountingOutRhymer();
    }

    /**
     * Tworzy i zwraca fałszywą instancję wyliczanki.
     * W domyślnej implementacji zwraca standardową wyliczankę.
     *
     * @return Nowy obiekt typu DefaultCountingOutRhymer.
     */
    @Override
    public DefaultCountingOutRhymer getFalseRhymer() {
        return new DefaultCountingOutRhymer();
    }

    /**
     * Tworzy i zwraca instancję wyliczanki działającej w oparciu o kolejkę FIFO
     * (First-In, First-Out).
     *
     * @return Nowy obiekt typu FIFORhymer.
     */
    @Override
    public DefaultCountingOutRhymer getFIFORhymer() {
        return new FIFORhymer();
    }

    /**
     * Tworzy i zwraca instancję wyliczanki symulującej działanie wież Hanoi.
     *
     * @return Nowy obiekt typu HanoiRhymer.
     */
    @Override
    public DefaultCountingOutRhymer getHanoiRhymer() {
        return new HanoiRhymer();
    }

}