package con.collection;

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
public class Fruit {
       private String name ,taste,colour;



    public Fruit(String name, String taste, String colour) {
        this.name = name;
        this.taste = taste;
        this.colour = colour;

    }
    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", taste='" + taste + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
