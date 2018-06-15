/**
 *
 */
package pro.buildmysoftware.webflux;

import pro.buildmysoftware.webflux.Event;

/**
 * @author goobar
 *
 */
public class EventFixture {
    /**
     * @param msg
     * @return
     */
    static Event event(String msg) {
        return new Event(msg);
    }
}
