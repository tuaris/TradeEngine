/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Server;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Danny
 */
public class Engine {
    //queue of buy/sell market orders (for single security)
    Queue<Order> MARKET_BUY = new LinkedList<>();
    Queue<Order> MARKET_SELL = new LinkedList<>();
    
    //queue of buy/sell limit orders (for single security)
    Queue<Order> LIMIT_BUY = new LinkedList<>();
    Queue<Order> LIMIT_SELL = new LinkedList<>();
    
    //queue of buy/sell stop orders (for single security)
    Queue<Order> STOP_BUY = new LinkedList<>();
    Queue<Order> STOP_SELL = new LinkedList<>();
    
    Float PRICE;
    String TICKER;
    
    Integer ORDER_ID = 0;
}
