package con.homework;

/***
 *
 *  .--,       .--,
 * ( (  \.---./  ) )
 *  '.__/o   o\__.'
 *     {=  ^  =}
 *      >  -  <
 *     /       \
 *    //       \\
 *   //|   .   |\\
 *   "'\       /'"_.-~^`'-.
 *      \  _  /--'         `
 *    ___)( )(___
 *   (((__) (__)))    高山仰止,景行行止.虽不能至,心向往之。
 */
public class Traffic {
    private String brand, price;

    public Traffic(String brand, String price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Traffic{" +
                "brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}