package br.com.fiap.winery;

import javax.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService {

    @Override
    public String getMenu() {
        return "Menu de Vinhos:\n"
                + "1 - Château d’Yquem\n"
                + "2 - Vinho Tinto Espanhol Muga Reserva\n"
                + "3 - Quinta dos Bons Ventos Tinto\n"
                + "4 - Constellation Woodbridge Zinfandel\n"
                + "5 - Domaine de la Romanée-Conti";
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido confirmado! Vinho: " + name + " | Quantidade: " + quantity;
    }
}
