import java.io.StringReader;
import java.util.*;
import java.lang.*;
import org.jgrapht.*;
import org.jgrapht.generate.*;
import org.jgrapht.graph.*;
import org.jgrapht.io.*;
import org.jgrapht.traverse.*;
public class Parse {

    public static void main(String[] args) {
        Graph<String,DefaultEdge> g = new SimpleDirectedGraph<String, DefaultEdge>(new ClassBasedEdgeFactory<String, DefaultEdge>(DefaultEdge.class));
//        g.addVertex("a");
//        g.addVertex("b");
//        g.addVertex("c");
//        g.addVertex("d");
//        g.addVertex("e");
//        g.addVertex("f");
//        CompleteGraphGenerator<String, DefaultEdge> completeGenerator =
//                new CompleteGraphGenerator<String, DefaultEdge>(5);
//        VertexFactory<String> vFactory = new VertexFactory<String>()
//        {
//            private int id = 0;
//
//            @Override
//            public String createVertex()
//            {
//                return "v" + id++;
//            }
//        };
//        //completeGenerator.generateGraph(g, vFactory,new Map<"a",>);
//
//        g.addEdge("a","b");
        GraphImporter<String, DefaultEdge> importer =new DOTImporter<String, DefaultEdge>((label, attributes) -> label, (from, to, label, attributes) -> new DefaultEdge());
        //DOTImporter a= new DOTImporter(new VertexProvider<String>()) ;
        String a = "digraph GOT {\n" +
                " graph [ bgcolor = whitesmoke ]\n" +
                " subgraph cluster_stark {\n" +
                " style = filled ;\n" +
                " color = lightblue ;\n" +
                " label = \" House Stark \" ;\n" +
                " node [ style = filled , color = white ];\n" +
                " Rickard ;\n" +
                " Brandon ; Eddard ; Benjen ; Lyanna ;\n" +
                " Robb ; Sansa ; Arya ; Brandon ; Rickon ;\n" +
                " Jon ;\n" +
                " Rickard -> Brandon ;\n" +
                " Rickard -> Eddard ;\n" +
                " Rickard -> Benjen ;\n" +
                " Rickard -> Lyanna ;\n" +
                " Eddard -> Robb ;\n" +
                " Eddard -> Sansa ;\n" +
                " Eddard -> Arya ;\n" +
                " Eddard -> Brandon ;\n" +
                " Eddard -> Rickon ;\n" +
                " Eddard -> Jon [ label = \" bastard \" , color = azure4 ];\n" +
                " }\n" +
                " subgraph cluster_targaryen {\n" +
                " style = filled ;\n" +
                " color = burlywood4 ;\n" +
                " label = \" House Targaryen \" ;\n" +
                " node [ style = filled , color = white ];\n" +
                " Rhaelle ; Rhaegar ; Viserys ; Daenerys ; Aegon ;\n" +
                " node [ style = filled , color = white , label = \" Maekar I \" ];\n" +
                " Maekar_I ;\n" +
                " node [ style = filled , color = white , label = \" Maester Aemon \" ];\n" +
                " Maester_Aemon ;\n" +
                " node [ style = filled , color = white , label = \" Aegon V \" ];\n" +
                " Aegon_V ;\n" +
                " node [ style = filled , color = white , label = \" Jaehaerys II \" ];\n" +
                " Jaehaerys_II ;\n" +
                " node [ style = filled , color = white , label = \" Aerys II the Mad\" ];\n " +
                " Aerys_II ;\n" +
                " Maekar_I -> Maester_Aemon ;\n" +
                " Maekar_I -> Aegon_V ;\n" +
                " Aegon_V -> Jaehaerys_II ;\n" +
                " Aegon_V -> Rhaelle ;\n" +
                " Jaehaerys_II -> Aerys_II ;\n" +
                "\n" +
                " Aerys_II -> Rhaegar ;\n" +
                " Aerys_II -> Viserys ;\n" +
                " Aerys_II -> Daenerys ;\n" +
                " Rhaegar -> Aegon ;\n" +
                " }\n" +
                " subgraph cluster_baratheon {\n" +
                " style = filled ;\n" +
                " color = chocolate3 ;\n" +
                " label = \" House Baratheon \" ;\n" +
                " node [ style = filled , color = white ];\n" +
                " Ormund ; Steffon ; Robert ; Stannis ; Renly ; Shireen ;\n" +
                " Joffrey ; Myrcellar ; Tommen ;\n" +
                " Ormund -> Steffon ;\n" +
                " Rhaelle -> Steffon ;\n" +
                " Ormund -> Rhaelle ;\n" +
                " Rhaelle -> Ormund ;\n" +
                " Steffon -> Robert ;\n" +
                " Steffon -> Stannis ;\n" +
                " Steffon -> Renly ;\n" +
                " Stannis -> Shireen ;\n" +
                " Robert -> Joffrey ;\n" +
                " Robert -> Myrcellar ;\n" +
                " Robert -> Tommen ;\n" +
                " }\n" +
                " subgraph cluster_lannister {\n" +
                " style = filled ;\n" +
                " color = cornsilk3 ;\n" +
                " label = \" House Lannister \" ;\n" +
                " node [ style = filled , color = white ];\n" +
                " Tywin ; Joanna ; Jaime ; Cersei ; Tyrion ;\n" +
                " Tywin -> Joanna ;\n" +
                " Joanna -> Tywin ;\n" +
                " Joanna -> Jaime ;\n" +
                " Joanna -> Cersei ;\n" +
                " Joanna -> Tyrion ;\n" +
                " Tywin -> Jaime ;\n" +
                " Tywin -> Cersei ;\n" +
                " Tywin -> Tyrion ;\n" +
                " Jaime -> Cersei ;\n" +
                " Cersei -> Jaime ;\n" +
                " Robert -> Cersei ;\n" +
                " Cersei -> Robert ;\n" +
                " Cersei -> Joffrey ;\n" +
                " Cersei -> Myrcellar ;\n" +
                " Cersei -> Tommen ;\n" +
                " Jaime -> Joffrey [ style = dashed ];\n" +
                "\n" +
                " Jaime -> Myrcellar [ style = dashed ];\n" +
                " Jaime -> Tommen [ style = dashed ];\n" +
                " }\n" +
                "\n" +
                " Lyanna -> Rhaegar [ style = dashed , label = \" ? \" ];\n" +
                " Rhaegar -> Lyanna [ style = dashed , label = \" ? \" ];\n" +
                " Lyanna -> Jon [ style = dashed , label = \" ? \" ];\n" +
                " Rhaegar -> Jon [ style = dashed , label = \" ? \" ];\n" +
                "\n" +
                " labelloc = \" t \" ;\n" +
                " fontsize =50;\n" +
                " fontcolor = lightslategrey ;\n" +
                " fontname = \" Bookman Old Style Bold Italic \" ;\n" +
                " label = \" Game of Thrones Family Tree \"\n" +
                " }\n"+" }";
        System.out.println("hi");
        try {
            importer.importGraph(g,new StringReader(a));
        } catch (ImportException e) {
            e.printStackTrace();
        }

    }
}
