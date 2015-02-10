/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author Praneeth Reddy
 */
public class MasterOrderCatalog {
    
    private ArrayList<Order> masterOrderList;
    
    public MasterOrderCatalog(){
       masterOrderList = new ArrayList<Order>();
    }

    /**
     * @return the masterOrderList
     */
    public ArrayList<Order> getMasterOrderList() {
        return masterOrderList;
    }

    /**
     * @param masterOrderList the masterOrderList to set
     */
    public void setMasterOrderList(ArrayList<Order> masterOrderList) {
        this.masterOrderList = masterOrderList;
    }
    
    public Order addOrder(Order order){
        masterOrderList.add(order);
    return order;
    }
}
