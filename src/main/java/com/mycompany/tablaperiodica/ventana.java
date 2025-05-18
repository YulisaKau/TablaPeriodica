package com.mycompany.tablaperiodica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public final class ventana extends javax.swing.JFrame implements ActionListener{

    public ventana() {
        initComponents();
        transparenciaboton();

        this.setLocationRelativeTo(this);
        jLabel37.setVisible(false);
        Ele.setVisible(false);
        Gnobles.setVisible(false);
        halogenos.setVisible(false);
        metaloides.setVisible(false);
        GNobles.setVisible(false);
        Otrmetales.setVisible(false);
        alcalinoterreos.setVisible(false);
        Malcalinos.setVisible(false);
        nometales.setVisible(false);
        nometales2.setVisible(false);
        Mtransicion.setVisible(false);
        lantanidos.setVisible(false);
        actinidos.setVisible(false);
        
        H.addActionListener(this);
        Litio.addActionListener(this);
        Francio.addActionListener(this);
        Sodio.addActionListener(this);
        Potasio.addActionListener(this);
        Rubidio.addActionListener(this);
        Cesio.addActionListener(this);
        Berilio.addActionListener(this);
        elemento.addActionListener(this);
        elemento1.addActionListener(this);
        elemento2.addActionListener(this);
        elemento3.addActionListener(this);
        elemento4.addActionListener(this);
        elemento5.addActionListener(this);
        elemento6.addActionListener(this);
        elemento7.addActionListener(this);
        elemento8.addActionListener(this);
        elemento9.addActionListener(this);
        elemento10.addActionListener(this);
        elemento11.addActionListener(this);
        elemento12.addActionListener(this);
        elemento13.addActionListener(this);
        elemento14.addActionListener(this);
        elemento15.addActionListener(this);
        elemento16.addActionListener(this);
        elemento17.addActionListener(this);
        elemento18.addActionListener(this);
        elemento19.addActionListener(this);
        elemento20.addActionListener(this);
        elemento21.addActionListener(this);
        elemento22.addActionListener(this);
        elemento23.addActionListener(this);
        elemento24.addActionListener(this);
        elemento25.addActionListener(this);
        elemento26.addActionListener(this);
        elemento27.addActionListener(this);
        elemento28.addActionListener(this);
        elemento29.addActionListener(this);
        elemento3.addActionListener(this);
        elemento30.addActionListener(this);
        elemento31.addActionListener(this);
        elemento32.addActionListener(this);
        elemento33.addActionListener(this);
        elemento34.addActionListener(this);
        elemento35.addActionListener(this);
        elemento36.addActionListener(this);
        elemento37.addActionListener(this);
        elemento38.addActionListener(this);
        elemento39.addActionListener(this);
        elemento40.addActionListener(this);
        elemento41.addActionListener(this);
        elemento42.addActionListener(this);
        elemento43.addActionListener(this);
        elemento44.addActionListener(this);
        elemento45.addActionListener(this);
        elemento46.addActionListener(this);
        elemento47.addActionListener(this);
        elemento48.addActionListener(this);
        elemento49.addActionListener(this);
        elemento50.addActionListener(this);
        elemento51.addActionListener(this);
        elemento52.addActionListener(this);
        elemento53.addActionListener(this);
        elemento54.addActionListener(this);
        elemento55.addActionListener(this);
        elemento56.addActionListener(this);
        elemento57.addActionListener(this);
        elemento58.addActionListener(this);
        elemento59.addActionListener(this);
        elemento60.addActionListener(this);
        elemento61.addActionListener(this);
        elemento62.addActionListener(this);
        elemento63.addActionListener(this);
        elemento64.addActionListener(this);
        elemento65.addActionListener(this);
        elemento66.addActionListener(this);
        elemento67.addActionListener(this);
        elemento68.addActionListener(this);
        elemento69.addActionListener(this);
        elemento70.addActionListener(this);
        elemento71.addActionListener(this);
        elemento72.addActionListener(this);
        elemento73.addActionListener(this);
        elemento74.addActionListener(this);
        elemento75.addActionListener(this);
        elemento76.addActionListener(this);
        elemento77.addActionListener(this);
        elemento78.addActionListener(this);
        elemento79.addActionListener(this);
        elemento80.addActionListener(this);
        elemento81.addActionListener(this);
        elemento82.addActionListener(this);
        elemento83.addActionListener(this);
        elemento84.addActionListener(this);
        elemento85.addActionListener(this);
        elemento86.addActionListener(this);
        elemento87.addActionListener(this);
        elemento88.addActionListener(this);
        elemento89.addActionListener(this);
        elemento90.addActionListener(this);
        elemento91.addActionListener(this);
        elemento92.addActionListener(this);
        elemento93.addActionListener(this);
        elemento94.addActionListener(this);
        elemento95.addActionListener(this);
        elemento96.addActionListener(this);
        elemento97.addActionListener(this);
        elemento98.addActionListener(this);
        elemento99.addActionListener(this);
        elemento100.addActionListener(this);
        elemento101.addActionListener(this);
        elemento102.addActionListener(this);
        elemento103.addActionListener(this);
        elemento104.addActionListener(this);
        elemento105.addActionListener(this);
        elemento106.addActionListener(this);
        elemento107.addActionListener(this);
        elemento108.addActionListener(this);
        elemento109.addActionListener(this);
        
        
    }

    public void actionPerformed(ActionEvent e){
        JButton o=(JButton)e.getSource();
        String name=o.getName();
        //e.getActionCommand().equals("New button1")
        switch (name) {
            case "H"->this.enlace("Hidrogeno","1","1.0","gaseoso","","/home/royel/Imágenes/1c1feffed7dc8a90a755642552b53990.gif");
            case "li"->this.enlace("Litio","3","6,9","liquido","","/home/trabajo/Imágenes/db9q9gh-4b04d3dc-c688-4b6f-9a8a-9deaec633439.gif");
            case "na"->this.enlace("Sodio","11","23,0","liquido","","/home/trabajo/Imágenes/db9q9gh-4b04d3dc-c688-4b6f-9a8a-9deaec633439.gif");
            case "k"->this.enlace("Potasio","19","39,1","liquido","","/home/trabajo/Imágenes/db9q9gh-4b04d3dc-c688-4b6f-9a8a-9deaec633439.gif");
            case "rb"->this.enlace("Rubidio","37","85,5","liquido","","/home/trabajo/Imágenes/db9q9gh-4b04d3dc-c688-4b6f-9a8a-9deaec633439.gif");
            case "cs"->this.enlace("Cesio","55","132,9","liquido","","/home/trabajo/Imágenes/db9q9gh-4b04d3dc-c688-4b6f-9a8a-9deaec633439.gif");
            case "fr"->this.enlace("Francio","87","233","liquido","","/home/trabajo/Imágenes/db9q9gh-4b04d3dc-c688-4b6f-9a8a-9deaec633439.gif");
            case "be"->this.enlace("Berilio","4","9,0","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "mg"->this.enlace("Magnesio","12","24,3","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "ca"->this.enlace("Calcio","20","40,1","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "sr"->this.enlace("Estroncio","38","87,6","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "ba"->this.enlace("Bario","56","137,6","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "ra"->this.enlace("Radio","88","266","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "sc"->this.enlace("Escandio","21","45,0'","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "y"->this.enlace("Itrio","39","88,9","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "lu"->this.enlace("Lutencio","71","175,0","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "lr"->this.enlace("Laurencio","103","262","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "ti"->this.enlace("Titanio","22","47,9","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "zr"->this.enlace("Circonio","40","91,2","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "hf"->this.enlace("Hafnio","72","178,5","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "rf"->this.enlace("Rutherfordio","104","261,1","desconocido","","/home/trabajo/Imágenes/loading-25.gif");
            case "v"->this.enlace("Vanadio","23","50,9","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "nb"->this.enlace("Niobio","41","92,9","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "ta"->this.enlace("Tantalo","73","108,9","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "db"->this.enlace("Dubnio","105","262,1","desconocido","","/home/trabajo/Imágenes/loading-25.gif");
            case "cr"->this.enlace("Cromo","24","52,0","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "mo"->this.enlace("Moilibdeno","42","95,9","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "w"->this.enlace("Volframio","74","183,8","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "sg"->this.enlace("Seaborgio","106","263,1","desconocido","","/home/trabajo/Imágenes/loading-25.gif");
            case "mn"->this.enlace("Manganeso","25","954,","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "tc"->this.enlace("Tecnecio","43","99","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "re"->this.enlace("Renio","75","186,2","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "bh"->this.enlace("Bohrio","107","264,1","desconocido","","/home/trabajo/Imágenes/loading-25.gif");
            case "fe"->this.enlace("Hierro","26","55,8","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "ru"->this.enlace("Rutenio","44","101,1","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "os"->this.enlace("Osmio","76","190,2","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "hs"->this.enlace("Hassio","108","177","desconocido","","/home/trabajo/Imágenes/loading-25.gif");
            case "co"->this.enlace("Cobalto","27","58,9","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "rh"->this.enlace("Rodio","45","102,9","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "ir"->this.enlace("Iridio","77","192,2","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "mt"->this.enlace("Meitnerio","109","268","desconocido","","/home/trabajo/Imágenes/loading-25.gif");
            case "ni"->this.enlace("Niquel","28","58,7","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "pd"->this.enlace("Paladio","46","106,4","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "pt"->this.enlace("Platino","78","195,1","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "ds"->this.enlace("Darmstatio","110","277","desconocido","","/home/trabajo/Imágenes/loading-25.gif");
            case "cu"->this.enlace("Cobre","29","63,5","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "ag"->this.enlace("Plata","46","106","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "au"->this.enlace("Oro","79","197,0","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "rg"->this.enlace("Roentgenio","111","272","desconocido","","/home/trabajo/Imágenes/loading-25.gif");
            case "zn"->this.enlace("Cinc","30","65,4","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "cd"->this.enlace("Cadmio","48","112,4","liquido","","/home/trabajo/Imágenes/db9q9gh-4b04d3dc-c688-4b6f-9a8a-9deaec633439.gif");
            case "hg"->this.enlace("Mercurio","80","200,6","gaseoso","","/home/trabajo/Imágenes/1c1feffed7dc8a90a755642552b53990.gif");
            case "cn"->this.enlace("Copernicio","112","285","desconocido","","/home/trabajo/Imágenes/loading-25.gif");
            case "b"->this.enlace("Boro","5","10,8","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "al"->this.enlace("Aluminio","13","27,0","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "ga"->this.enlace("Galio","31","69,7","liquido","","/home/trabajo/Imágenes/db9q9gh-4b04d3dc-c688-4b6f-9a8a-9deaec633439.gif");
            case "in"->this.enlace("Indio","49","118,7","liquido","","/home/trabajo/Imágenes/db9q9gh-4b04d3dc-c688-4b6f-9a8a-9deaec633439.gif");
            case "tl"->this.enlace("Talio","81","204,4","liquido","","/home/trabajo/Imágenes/db9q9gh-4b04d3dc-c688-4b6f-9a8a-9deaec633439.gif");
            case "nh"->this.enlace("Nihonio","113","284","desconocido","","/home/trabajo/Imágenes/loading-25.gif");
            case "c"->this.enlace("Carbono","6","12,0","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "si"->this.enlace("Silicio","14","28,1","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "ge"->this.enlace("Germanio","32","72,6","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "sn"->this.enlace("Estaño","50","118,7","liquido","","/home/trabajo/Imágenes/db9q9gh-4b04d3dc-c688-4b6f-9a8a-9deaec633439.gif");
            case "pb"->this.enlace("Plomo","82","207,2","liquido","","/home/trabajo/Imágenes/db9q9gh-4b04d3dc-c688-4b6f-9a8a-9deaec633439.gif");
            case "fl"->this.enlace("Flerovio","114","289","desconocido","","/home/trabajo/Imágenes/loading-25.gif");
            case "n"->this.enlace("Nitrogenio","7","14,0","gaseoso","","/home/trabajo/Imágenes/1c1feffed7dc8a90a755642552b53990.gif");
            case "p"->this.enlace("Fosforo","15","31,0","gaseoso","","/home/trabajo/Imágenes/1c1feffed7dc8a90a755642552b53990.gif");
            case "as"->this.enlace("Arsénico","33","74,9","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "sb"->this.enlace("Antimonio","51","121,8","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "bi"->this.enlace("Bismuto","83","209,2","liquido","","/home/trabajo/Imágenes/db9q9gh-4b04d3dc-c688-4b6f-9a8a-9deaec633439.gif");
            case "mc"->this.enlace("Moscobio","115","188","desconocido","","/home/trabajo/Imágenes/loading-25.gif");
            case "o"->this.enlace("Oxigeno","8","15,9","gaseoso","","/home/trabajo/Imágenes/1c1feffed7dc8a90a755642552b53990.gif");
            case "s"->this.enlace("Asúfre","16","32,1","liquido","","/home/trabajo/Imágenes/db9q9gh-4b04d3dc-c688-4b6f-9a8a-9deaec633439.gif");
            case "se"->this.enlace("Selenio","34","79,0","liquido","","/home/trabajo/Imágenes/db9q9gh-4b04d3dc-c688-4b6f-9a8a-9deaec633439.gif");
            case "te"->this.enlace("Telurio","52","127,6","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "po"->this.enlace("Polonio","84","210","liquido","","/home/trabajo/Imágenes/db9q9gh-4b04d3dc-c688-4b6f-9a8a-9deaec633439.gif");
            case "lv"->this.enlace("Livermonio","116","292","desconocido","","/home/trabajo/Imágenes/loading-25.gif");
            case "f"->this.enlace("Flúor","9","19,0","gaseoso","","/home/trabajo/Imágenes/1c1feffed7dc8a90a755642552b53990.gif");
            case "cl"->this.enlace("Cloro","17","35,5","gaseoso","","/home/trabajo/Imágenes/1c1feffed7dc8a90a755642552b53990.gif");
            case "br"->this.enlace("Bromo","35","79,0","gaseoso","","/home/trabajo/Imágenes/1c1feffed7dc8a90a755642552b53990.gif");
            case "i"->this.enlace("Yodo","53","126,9","gaseoso","","/home/trabajo/Imágenes/1c1feffed7dc8a90a755642552b53990.gif");
            case "at"->this.enlace("Astato","85","210","gaseoso","","/home/trabajo/Imágenes/1c1feffed7dc8a90a755642552b53990.gif");
            case "ts"->this.enlace("Teneso","117","294","desconocido","","/home/trabajo/Imágenes/loading-25.gif");
            case "he"->this.enlace("Helio","2","4,0","gaseoso","","/home/trabajo/Imágenes/1c1feffed7dc8a90a755642552b53990.gif");
            case "ne"->this.enlace("Neón","10","20,2","gaseoso","","/home/trabajo/Imágenes/1c1feffed7dc8a90a755642552b53990.gif");
            case "ar"->this.enlace("Argón","18","39,9","gaseoso","","/home/trabajo/Imágenes/1c1feffed7dc8a90a755642552b53990.gif");
            case "kr"->this.enlace("Kriptón","36","83,8","gaseoso","","/home/trabajo/Imágenes/1c1feffed7dc8a90a755642552b53990.gif");
            case "xe"->this.enlace("Xenón","54","131,3","gaseoso","","/home/trabajo/Imágenes/1c1feffed7dc8a90a755642552b53990.gif");
            case "rn"->this.enlace("Radon","86","222","gaseoso","","/home/trabajo/Imágenes/1c1feffed7dc8a90a755642552b53990.gif");
            case "og"->this.enlace("Oganesón","118","294","desconocido","","/home/trabajo/Imágenes/loading-25.gif");
            case "la"->this.enlace("Lantano","57","138,9","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "ce"->this.enlace("Cerio","58","140,1","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "pr"->this.enlace("Praseodimio","59","140,9","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "nd"->this.enlace("Neodimio","60","144,4","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "pm"->this.enlace("Prometio","61","147","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "sm"->this.enlace("Samario","62","150,3","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "eu"->this.enlace("Europio","63","152,0","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "gd"->this.enlace("Gadolinio","64","157,2","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "tb"->this.enlace("Terbio","65","158,9","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "dy"->this.enlace("Disprosio","66","162","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "ho"->this.enlace("Holmio","67","164,9","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "er"->this.enlace("Erbio","68","167,3","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "tm"->this.enlace("Tulio","69","168,9","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "yb"->this.enlace("Iterbio","70","173,0","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "ac"->this.enlace("Actinio","89","227","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "th"->this.enlace("Torio","90","232,0","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "pa"->this.enlace("Protactinio","91","231","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "u"->this.enlace("Uranio","92","238,0","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "np"->this.enlace("Neptunio","93","237","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "pu"->this.enlace("Plutonio","94","242","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "am"->this.enlace("Americio","95","243","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "cm"->this.enlace("Curio","96","247","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "bk"->this.enlace("Berquelio","97","247","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "cf"->this.enlace("Californio","98","251","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "es"->this.enlace("Einstenio","99","252","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "fm"->this.enlace("Fermio","100","257","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "md"->this.enlace("Mendelevio","101","256","solido","","/home/trabajo/Imágenes/giphy (1).gif");
            case "no"->this.enlace("Nobelio","102","259","solido","","/home/trabajo/Imágenes/giphy (1).gif");
        }
    }
    
    public void enlace (String nombre,String numAtomico,String masa,String estadodeAg,String electro,String gif){
        informacion a = new informacion();
        a.rellena("Nombre: " +nombre+ "\n" + "\n" + "Numero atómico: " +numAtomico+ "\n" + "\n" + "Masa atómica: " +masa+ "\n" + "\n" + "Estado de agregacion: "+estadodeAg+"\n" + "\n" + "Electronegatividad: "+electro);
        a.setVisible(true);
        a.rellena2(gif);
    }
        
    public void transparenciaboton() {
        H.setOpaque(false);
        Litio.setOpaque(false);
        Francio.setOpaque(false);
        Sodio.setOpaque(false);
        Potasio.setOpaque(false);
        Rubidio.setOpaque(false);
        Cesio.setOpaque(false);
        Berilio.setOpaque(false);
        elemento.setOpaque(false);
        elemento1.setOpaque(false);
        elemento2.setOpaque(false);
        elemento3.setOpaque(false);
        elemento4.setOpaque(false);
        elemento5.setOpaque(false);
        elemento6.setOpaque(false);
        elemento7.setOpaque(false);
        elemento8.setOpaque(false);
        elemento9.setOpaque(false);
        elemento10.setOpaque(false);
        elemento11.setOpaque(false);
        elemento12.setOpaque(false);
        elemento13.setOpaque(false);
        elemento14.setOpaque(false);
        elemento15.setOpaque(false);
        elemento16.setOpaque(false);
        elemento17.setOpaque(false);
        elemento18.setOpaque(false);
        elemento19.setOpaque(false);
        elemento20.setOpaque(false);
        elemento21.setOpaque(false);
        elemento22.setOpaque(false);
        elemento23.setOpaque(false);
        elemento24.setOpaque(false);
        elemento25.setOpaque(false);
        elemento26.setOpaque(false);
        elemento27.setOpaque(false);
        elemento28.setOpaque(false);
        elemento29.setOpaque(false);
        elemento30.setOpaque(false);
        elemento31.setOpaque(false);
        elemento32.setOpaque(false);
        elemento33.setOpaque(false);
        elemento34.setOpaque(false);
        elemento35.setOpaque(false);
        elemento36.setOpaque(false);
        elemento37.setOpaque(false);
        elemento38.setOpaque(false);
        elemento39.setOpaque(false);
        elemento40.setOpaque(false);
        elemento41.setOpaque(false);
        elemento42.setOpaque(false);
        elemento43.setOpaque(false);
        elemento44.setOpaque(false);
        elemento45.setOpaque(false);
        elemento46.setOpaque(false);
        elemento47.setOpaque(false);
        elemento48.setOpaque(false);
        elemento49.setOpaque(false);
        elemento50.setOpaque(false);
        elemento51.setOpaque(false);
        elemento52.setOpaque(false);
        elemento53.setOpaque(false);
        elemento54.setOpaque(false);
        elemento55.setOpaque(false);
        elemento56.setOpaque(false);
        elemento57.setOpaque(false);
        elemento58.setOpaque(false);
        elemento59.setOpaque(false);
        elemento60.setOpaque(false);
        elemento61.setOpaque(false);
        elemento62.setOpaque(false);
        elemento63.setOpaque(false);
        elemento64.setOpaque(false);
        elemento65.setOpaque(false);
        elemento66.setOpaque(false);
        elemento67.setOpaque(false);
        elemento68.setOpaque(false);
        elemento69.setOpaque(false);
        elemento70.setOpaque(false);
        elemento71.setOpaque(false);
        elemento72.setOpaque(false);
        elemento73.setOpaque(false);
        elemento74.setOpaque(false);
        elemento75.setOpaque(false);
        elemento76.setOpaque(false);
        elemento77.setOpaque(false);
        elemento78.setOpaque(false);
        elemento79.setOpaque(false);
        elemento80.setOpaque(false);
        elemento81.setOpaque(false);
        elemento82.setOpaque(false);
        elemento83.setOpaque(false);
        elemento84.setOpaque(false);
        elemento85.setOpaque(false);
        elemento86.setOpaque(false);
        elemento87.setOpaque(false);
        elemento88.setOpaque(false);
        elemento89.setOpaque(false);
        elemento90.setOpaque(false);
        elemento91.setOpaque(false);
        elemento92.setOpaque(false);
        elemento93.setOpaque(false);
        elemento94.setOpaque(false);
        elemento95.setOpaque(false);
        elemento96.setOpaque(false);
        elemento97.setOpaque(false);
        elemento98.setOpaque(false);
        elemento99.setOpaque(false);
        elemento100.setOpaque(false);
        elemento101.setOpaque(false);
        elemento102.setOpaque(false);
        elemento103.setOpaque(false);
        elemento104.setOpaque(false);
        elemento105.setOpaque(false);
        elemento106.setOpaque(false);
        elemento107.setOpaque(false);
        elemento108.setOpaque(false);
        elemento109.setOpaque(false);

    }

    String nombre = "";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Gnobles = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        nometales = new javax.swing.JLabel();
        Otrmetales = new javax.swing.JLabel();
        metaloides = new javax.swing.JLabel();
        nometales2 = new javax.swing.JLabel();
        alcalinoterreos = new javax.swing.JLabel();
        halogenos = new javax.swing.JLabel();
        actinidos = new javax.swing.JLabel();
        Mtransicion = new javax.swing.JLabel();
        lantanidos = new javax.swing.JLabel();
        Malcalinos = new javax.swing.JLabel();
        GNobles = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        Ele = new javax.swing.JLabel();
        H = new javax.swing.JButton();
        Litio = new javax.swing.JButton();
        Francio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btelectro = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        Sodio = new javax.swing.JButton();
        Potasio = new javax.swing.JButton();
        Rubidio = new javax.swing.JButton();
        Cesio = new javax.swing.JButton();
        Berilio = new javax.swing.JButton();
        elemento = new javax.swing.JButton();
        elemento1 = new javax.swing.JButton();
        elemento2 = new javax.swing.JButton();
        elemento3 = new javax.swing.JButton();
        elemento4 = new javax.swing.JButton();
        elemento5 = new javax.swing.JButton();
        elemento6 = new javax.swing.JButton();
        elemento7 = new javax.swing.JButton();
        elemento8 = new javax.swing.JButton();
        elemento9 = new javax.swing.JButton();
        elemento10 = new javax.swing.JButton();
        elemento11 = new javax.swing.JButton();
        elemento12 = new javax.swing.JButton();
        elemento13 = new javax.swing.JButton();
        elemento14 = new javax.swing.JButton();
        elemento15 = new javax.swing.JButton();
        elemento16 = new javax.swing.JButton();
        elemento17 = new javax.swing.JButton();
        elemento18 = new javax.swing.JButton();
        elemento19 = new javax.swing.JButton();
        elemento20 = new javax.swing.JButton();
        elemento21 = new javax.swing.JButton();
        elemento22 = new javax.swing.JButton();
        elemento23 = new javax.swing.JButton();
        elemento24 = new javax.swing.JButton();
        elemento25 = new javax.swing.JButton();
        elemento26 = new javax.swing.JButton();
        elemento27 = new javax.swing.JButton();
        elemento28 = new javax.swing.JButton();
        elemento29 = new javax.swing.JButton();
        elemento30 = new javax.swing.JButton();
        elemento31 = new javax.swing.JButton();
        elemento32 = new javax.swing.JButton();
        elemento33 = new javax.swing.JButton();
        elemento34 = new javax.swing.JButton();
        elemento35 = new javax.swing.JButton();
        elemento36 = new javax.swing.JButton();
        elemento37 = new javax.swing.JButton();
        elemento38 = new javax.swing.JButton();
        elemento39 = new javax.swing.JButton();
        elemento40 = new javax.swing.JButton();
        elemento41 = new javax.swing.JButton();
        elemento42 = new javax.swing.JButton();
        elemento43 = new javax.swing.JButton();
        elemento44 = new javax.swing.JButton();
        elemento45 = new javax.swing.JButton();
        elemento46 = new javax.swing.JButton();
        elemento47 = new javax.swing.JButton();
        elemento48 = new javax.swing.JButton();
        elemento49 = new javax.swing.JButton();
        elemento50 = new javax.swing.JButton();
        elemento51 = new javax.swing.JButton();
        elemento52 = new javax.swing.JButton();
        elemento53 = new javax.swing.JButton();
        elemento54 = new javax.swing.JButton();
        elemento55 = new javax.swing.JButton();
        elemento56 = new javax.swing.JButton();
        elemento57 = new javax.swing.JButton();
        elemento58 = new javax.swing.JButton();
        elemento59 = new javax.swing.JButton();
        elemento60 = new javax.swing.JButton();
        elemento61 = new javax.swing.JButton();
        elemento62 = new javax.swing.JButton();
        elemento63 = new javax.swing.JButton();
        elemento64 = new javax.swing.JButton();
        elemento65 = new javax.swing.JButton();
        elemento66 = new javax.swing.JButton();
        elemento67 = new javax.swing.JButton();
        elemento68 = new javax.swing.JButton();
        elemento69 = new javax.swing.JButton();
        elemento70 = new javax.swing.JButton();
        elemento71 = new javax.swing.JButton();
        elemento72 = new javax.swing.JButton();
        elemento73 = new javax.swing.JButton();
        elemento74 = new javax.swing.JButton();
        elemento75 = new javax.swing.JButton();
        elemento76 = new javax.swing.JButton();
        elemento77 = new javax.swing.JButton();
        elemento78 = new javax.swing.JButton();
        elemento79 = new javax.swing.JButton();
        elemento80 = new javax.swing.JButton();
        elemento81 = new javax.swing.JButton();
        elemento82 = new javax.swing.JButton();
        elemento83 = new javax.swing.JButton();
        elemento84 = new javax.swing.JButton();
        elemento85 = new javax.swing.JButton();
        elemento86 = new javax.swing.JButton();
        elemento87 = new javax.swing.JButton();
        elemento88 = new javax.swing.JButton();
        elemento89 = new javax.swing.JButton();
        elemento90 = new javax.swing.JButton();
        elemento91 = new javax.swing.JButton();
        elemento92 = new javax.swing.JButton();
        elemento93 = new javax.swing.JButton();
        elemento94 = new javax.swing.JButton();
        elemento95 = new javax.swing.JButton();
        elemento96 = new javax.swing.JButton();
        elemento97 = new javax.swing.JButton();
        elemento98 = new javax.swing.JButton();
        elemento99 = new javax.swing.JButton();
        elemento100 = new javax.swing.JButton();
        elemento101 = new javax.swing.JButton();
        elemento102 = new javax.swing.JButton();
        elemento103 = new javax.swing.JButton();
        elemento104 = new javax.swing.JButton();
        elemento105 = new javax.swing.JButton();
        elemento106 = new javax.swing.JButton();
        elemento107 = new javax.swing.JButton();
        elemento108 = new javax.swing.JButton();
        elemento109 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tabla periodica");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 51, 153));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setName("H"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setBackground(new java.awt.Color(254, 254, 254));
        jLabel27.setFont(new java.awt.Font("Comic Book", 0, 15)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(254, 254, 254));
        jLabel27.setText("Otros metales");
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel27MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel27MouseExited(evt);
            }
        });
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 130, 20));

        jLabel28.setBackground(new java.awt.Color(254, 254, 254));
        jLabel28.setFont(new java.awt.Font("Comic Book", 0, 15)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(254, 254, 254));
        jLabel28.setText("Gases nobles");
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel28MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel28MouseExited(evt);
            }
        });
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 120, 20));

        jLabel29.setBackground(new java.awt.Color(254, 254, 254));
        jLabel29.setFont(new java.awt.Font("Comic Book", 0, 15)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(254, 254, 254));
        jLabel29.setText("Halógenos");
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel29MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel29MouseExited(evt);
            }
        });
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 110, 20));

        jLabel30.setBackground(new java.awt.Color(254, 254, 254));
        jLabel30.setFont(new java.awt.Font("Comic Book", 0, 15)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(254, 254, 254));
        jLabel30.setText("No metales");
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel30MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel30MouseExited(evt);
            }
        });
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 130, 20));

        jLabel31.setBackground(new java.awt.Color(254, 254, 254));
        jLabel31.setFont(new java.awt.Font("Comic Book", 0, 15)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(254, 254, 254));
        jLabel31.setText("Metaloides");
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel31MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel31MouseExited(evt);
            }
        });
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 130, 20));

        jLabel32.setBackground(new java.awt.Color(254, 254, 254));
        jLabel32.setFont(new java.awt.Font("Comic Book", 0, 15)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(254, 254, 254));
        jLabel32.setText("Actinidos");
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel32MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel32MouseExited(evt);
            }
        });
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 80, 20));

        jLabel33.setBackground(new java.awt.Color(254, 254, 254));
        jLabel33.setFont(new java.awt.Font("Comic Book", 0, 15)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(254, 254, 254));
        jLabel33.setText("Lantánidos");
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel33MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel33MouseExited(evt);
            }
        });
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 100, 20));

        jLabel34.setBackground(new java.awt.Color(254, 254, 254));
        jLabel34.setFont(new java.awt.Font("Comic Book", 0, 15)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(254, 254, 254));
        jLabel34.setText("Metales alcalinos");
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel34MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel34MouseExited(evt);
            }
        });
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 150, 20));

        jLabel35.setBackground(new java.awt.Color(254, 254, 254));
        jLabel35.setFont(new java.awt.Font("Comic Book", 0, 15)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(254, 254, 254));
        jLabel35.setText("Alcalinotérreos");
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel35MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel35MouseExited(evt);
            }
        });
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 140, 20));

        jLabel36.setBackground(new java.awt.Color(254, 254, 254));
        jLabel36.setFont(new java.awt.Font("Comic Book", 0, 15)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(254, 254, 254));
        jLabel36.setText("Metales de transición");
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel36MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel36MouseExited(evt);
            }
        });
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 180, 20));
        getContentPane().add(nometales, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, -1, 180));
        getContentPane().add(Otrmetales, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, -1, 260));
        getContentPane().add(metaloides, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, -1, 260));
        getContentPane().add(nometales2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 50, 50));
        getContentPane().add(alcalinoterreos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 50, 300));
        getContentPane().add(halogenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 110, 50, 300));
        getContentPane().add(actinidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 740, 50));
        getContentPane().add(Mtransicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 510, 200));
        getContentPane().add(lantanidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 730, 60));
        getContentPane().add(Malcalinos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 50, 300));
        getContentPane().add(GNobles, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 60, 50, 350));
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));
        getContentPane().add(Ele, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 900, 490));

        H.setBackground(new java.awt.Color(74, 74, 74));
        H.setIcon(new javax.swing.ImageIcon("/home/royel/Imágenes/Elementos/H.png")); // NOI18N
        H.setToolTipText("");
        H.setBorder(null);
        H.setBorderPainted(false);
        H.setName("H"); // NOI18N
        H.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                HMouseReleased(evt);
            }
        });
        H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HActionPerformed(evt);
            }
        });
        getContentPane().add(H, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 50, 48));

        Litio.setBackground(new java.awt.Color(74, 74, 74));
        Litio.setIcon(new javax.swing.ImageIcon("/home/royel/Imágenes/Elementos/Li.png")); // NOI18N
        Litio.setAlignmentX(0.5F);
        Litio.setBorderPainted(false);
        Litio.setName("li"); // NOI18N
        Litio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LitioActionPerformed(evt);
            }
        });
        getContentPane().add(Litio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 48, 47));

        Francio.setBackground(new java.awt.Color(74, 74, 74));
        Francio.setText("Fr");
        Francio.setBorder(null);
        Francio.setBorderPainted(false);
        Francio.setName("fr"); // NOI18N
        Francio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrancioActionPerformed(evt);
            }
        });
        getContentPane().add(Francio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 48, 45));

        jLabel1.setBackground(new java.awt.Color(254, 254, 254));
        jLabel1.setFont(new java.awt.Font("Elephant", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("4");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 24, -1));

        jLabel2.setBackground(new java.awt.Color(254, 254, 254));
        jLabel2.setFont(new java.awt.Font("Elephant", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("II A");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 24, -1));

        jLabel3.setBackground(new java.awt.Color(254, 254, 254));
        jLabel3.setFont(new java.awt.Font("Elephant", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 24, -1));

        jLabel4.setBackground(new java.awt.Color(254, 254, 254));
        jLabel4.setFont(new java.awt.Font("Elephant", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("5");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 24, -1));

        jLabel5.setBackground(new java.awt.Color(254, 254, 254));
        jLabel5.setFont(new java.awt.Font("Elephant", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("7");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 24, -1));

        jLabel6.setBackground(new java.awt.Color(254, 254, 254));
        jLabel6.setFont(new java.awt.Font("Elephant", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("3");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 24, -1));

        jLabel7.setBackground(new java.awt.Color(254, 254, 254));
        jLabel7.setFont(new java.awt.Font("Elephant", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText("6");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 24, -1));

        btelectro.setBackground(new java.awt.Color(254, 254, 254));
        btelectro.setFont(new java.awt.Font("Comic Book", 0, 15)); // NOI18N
        btelectro.setForeground(new java.awt.Color(254, 254, 254));
        btelectro.setText("Electronegatividad");
        btelectro.setBorderPainted(false);
        btelectro.setContentAreaFilled(false);
        btelectro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btelectroActionPerformed(evt);
            }
        });
        getContentPane().add(btelectro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 90, -1, -1));

        jToggleButton1.setBackground(new java.awt.Color(254, 254, 254));
        jToggleButton1.setFont(new java.awt.Font("Comic Book", 0, 15)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(254, 254, 254));
        jToggleButton1.setText("sdpf");
        jToggleButton1.setBorderPainted(false);
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 140, -1, -1));

        Sodio.setBackground(new java.awt.Color(74, 74, 74));
        Sodio.setIcon(new javax.swing.ImageIcon("/home/royel/Imágenes/Elementos/Na.png")); // NOI18N
        Sodio.setBorderPainted(false);
        Sodio.setName("na"); // NOI18N
        Sodio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SodioActionPerformed(evt);
            }
        });
        getContentPane().add(Sodio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 48, 45));

        Potasio.setBackground(new java.awt.Color(74, 74, 74));
        Potasio.setIcon(new javax.swing.ImageIcon("/home/royel/Imágenes/Elementos/K.png")); // NOI18N
        Potasio.setBorder(null);
        Potasio.setBorderPainted(false);
        Potasio.setName("k"); // NOI18N
        Potasio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PotasioActionPerformed(evt);
            }
        });
        getContentPane().add(Potasio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 48, 45));

        Rubidio.setBackground(new java.awt.Color(74, 74, 74));
        Rubidio.setIcon(new javax.swing.ImageIcon("/home/royel/Imágenes/Elementos/Rb.png")); // NOI18N
        Rubidio.setBorder(null);
        Rubidio.setBorderPainted(false);
        Rubidio.setName("rb"); // NOI18N
        Rubidio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RubidioActionPerformed(evt);
            }
        });
        getContentPane().add(Rubidio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 48, 45));

        Cesio.setBackground(new java.awt.Color(74, 74, 74));
        Cesio.setText("Cs");
        Cesio.setBorder(null);
        Cesio.setBorderPainted(false);
        Cesio.setName("cs"); // NOI18N
        Cesio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CesioActionPerformed(evt);
            }
        });
        getContentPane().add(Cesio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 48, 45));

        Berilio.setBackground(new java.awt.Color(74, 74, 74));
        Berilio.setText("Be");
        Berilio.setBorderPainted(false);
        Berilio.setName("be"); // NOI18N
        Berilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BerilioActionPerformed(evt);
            }
        });
        getContentPane().add(Berilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 48, 47));

        elemento.setBackground(new java.awt.Color(74, 74, 74));
        elemento.setText("Ra");
        elemento.setBorder(null);
        elemento.setBorderPainted(false);
        elemento.setName("ra"); // NOI18N
        elemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elementoActionPerformed(evt);
            }
        });
        getContentPane().add(elemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 48, 45));

        elemento1.setBackground(new java.awt.Color(74, 74, 74));
        elemento1.setText("Mg");
        elemento1.setBorderPainted(false);
        elemento1.setName("mg"); // NOI18N
        elemento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento1ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 48, 45));

        elemento2.setBackground(new java.awt.Color(74, 74, 74));
        elemento2.setText("Ca");
        elemento2.setBorder(null);
        elemento2.setBorderPainted(false);
        elemento2.setName("ca"); // NOI18N
        elemento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento2ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 48, 45));

        elemento3.setBackground(new java.awt.Color(74, 74, 74));
        elemento3.setText("Sr");
        elemento3.setBorder(null);
        elemento3.setBorderPainted(false);
        elemento3.setName("sr"); // NOI18N
        elemento3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento3ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 48, 45));

        elemento4.setBackground(new java.awt.Color(74, 74, 74));
        elemento4.setText("Br");
        elemento4.setBorder(null);
        elemento4.setBorderPainted(false);
        elemento4.setName("ba"); // NOI18N
        elemento4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento4ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 48, 45));

        elemento5.setBackground(new java.awt.Color(74, 74, 74));
        elemento5.setBorder(null);
        elemento5.setBorderPainted(false);
        elemento5.setName("lr"); // NOI18N
        elemento5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento5ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 48, 45));

        elemento6.setBackground(new java.awt.Color(74, 74, 74));
        elemento6.setText("Sc");
        elemento6.setBorder(null);
        elemento6.setBorderPainted(false);
        elemento6.setName("sc"); // NOI18N
        elemento6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento6ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 48, 45));

        elemento7.setBackground(new java.awt.Color(74, 74, 74));
        elemento7.setText("Y");
        elemento7.setBorder(null);
        elemento7.setBorderPainted(false);
        elemento7.setName("y"); // NOI18N
        elemento7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento7ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 48, 45));

        elemento8.setBackground(new java.awt.Color(74, 74, 74));
        elemento8.setBorder(null);
        elemento8.setBorderPainted(false);
        elemento8.setName("lu"); // NOI18N
        elemento8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento8ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 48, 45));

        elemento9.setBackground(new java.awt.Color(74, 74, 74));
        elemento9.setBorderPainted(false);
        elemento9.setName("rf"); // NOI18N
        elemento9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento9ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 48, 45));

        elemento10.setBackground(new java.awt.Color(74, 74, 74));
        elemento10.setBorderPainted(false);
        elemento10.setName("ti"); // NOI18N
        elemento10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento10ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 48, 45));

        elemento11.setBackground(new java.awt.Color(74, 74, 74));
        elemento11.setBorderPainted(false);
        elemento11.setName("zr"); // NOI18N
        elemento11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento11ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 48, 45));

        elemento12.setBackground(new java.awt.Color(74, 74, 74));
        elemento12.setBorderPainted(false);
        elemento12.setName("hf"); // NOI18N
        elemento12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento12ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 48, 45));

        elemento13.setBackground(new java.awt.Color(74, 74, 74));
        elemento13.setBorderPainted(false);
        elemento13.setName("db"); // NOI18N
        elemento13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento13ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 48, 45));

        elemento14.setBackground(new java.awt.Color(74, 74, 74));
        elemento14.setBorderPainted(false);
        elemento14.setName("v"); // NOI18N
        elemento14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento14ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 48, 45));

        elemento15.setBackground(new java.awt.Color(74, 74, 74));
        elemento15.setBorderPainted(false);
        elemento15.setName("nb"); // NOI18N
        elemento15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento15ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 48, 45));

        elemento16.setBackground(new java.awt.Color(74, 74, 74));
        elemento16.setBorderPainted(false);
        elemento16.setName("ta"); // NOI18N
        elemento16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento16ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 48, 45));

        elemento17.setBackground(new java.awt.Color(74, 74, 74));
        elemento17.setBorderPainted(false);
        elemento17.setName("sg"); // NOI18N
        elemento17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento17ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 48, 45));

        elemento18.setBackground(new java.awt.Color(74, 74, 74));
        elemento18.setBorderPainted(false);
        elemento18.setName("cr"); // NOI18N
        elemento18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento18ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento18, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 48, 45));

        elemento19.setBackground(new java.awt.Color(74, 74, 74));
        elemento19.setBorderPainted(false);
        elemento19.setName("mo"); // NOI18N
        elemento19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento19ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento19, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 48, 45));

        elemento20.setBackground(new java.awt.Color(74, 74, 74));
        elemento20.setBorderPainted(false);
        elemento20.setName("w"); // NOI18N
        elemento20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento20ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento20, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 48, 45));

        elemento21.setBackground(new java.awt.Color(74, 74, 74));
        elemento21.setBorderPainted(false);
        elemento21.setName("bh"); // NOI18N
        elemento21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento21ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento21, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 48, 45));

        elemento22.setBackground(new java.awt.Color(74, 74, 74));
        elemento22.setBorderPainted(false);
        elemento22.setName("mn"); // NOI18N
        elemento22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento22ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 48, 45));

        elemento23.setBackground(new java.awt.Color(74, 74, 74));
        elemento23.setBorderPainted(false);
        elemento23.setName("tc"); // NOI18N
        elemento23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento23ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento23, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 48, 45));

        elemento24.setBackground(new java.awt.Color(74, 74, 74));
        elemento24.setBorderPainted(false);
        elemento24.setName("re"); // NOI18N
        elemento24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento24ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento24, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 48, 45));

        elemento25.setBackground(new java.awt.Color(74, 74, 74));
        elemento25.setBorderPainted(false);
        elemento25.setName("hs"); // NOI18N
        elemento25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento25ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento25, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 48, 45));

        elemento26.setBackground(new java.awt.Color(74, 74, 74));
        elemento26.setBorderPainted(false);
        elemento26.setName("fe"); // NOI18N
        elemento26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento26ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento26, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 48, 45));

        elemento27.setBackground(new java.awt.Color(74, 74, 74));
        elemento27.setBorderPainted(false);
        elemento27.setName("ru"); // NOI18N
        elemento27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento27ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento27, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 48, 45));

        elemento28.setBackground(new java.awt.Color(74, 74, 74));
        elemento28.setBorderPainted(false);
        elemento28.setName("os"); // NOI18N
        elemento28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento28ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento28, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 48, 45));

        elemento29.setBackground(new java.awt.Color(74, 74, 74));
        elemento29.setBorderPainted(false);
        elemento29.setName("mt"); // NOI18N
        elemento29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento29ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento29, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 48, 45));

        elemento30.setBackground(new java.awt.Color(74, 74, 74));
        elemento30.setBorderPainted(false);
        elemento30.setName("co"); // NOI18N
        elemento30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento30ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento30, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 48, 45));

        elemento31.setBackground(new java.awt.Color(74, 74, 74));
        elemento31.setBorderPainted(false);
        elemento31.setName("rh"); // NOI18N
        elemento31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento31ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento31, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 48, 45));

        elemento32.setBackground(new java.awt.Color(74, 74, 74));
        elemento32.setBorderPainted(false);
        elemento32.setName("ir"); // NOI18N
        elemento32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento32ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento32, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 48, 45));

        elemento33.setBackground(new java.awt.Color(74, 74, 74));
        elemento33.setBorderPainted(false);
        elemento33.setName("ds"); // NOI18N
        elemento33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento33ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento33, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 48, 45));

        elemento34.setBackground(new java.awt.Color(74, 74, 74));
        elemento34.setBorderPainted(false);
        elemento34.setName("ni"); // NOI18N
        elemento34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento34ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento34, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 48, 45));

        elemento35.setBackground(new java.awt.Color(74, 74, 74));
        elemento35.setBorderPainted(false);
        elemento35.setName("pd"); // NOI18N
        elemento35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento35ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento35, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 48, 45));

        elemento36.setBackground(new java.awt.Color(74, 74, 74));
        elemento36.setBorderPainted(false);
        elemento36.setName("pt"); // NOI18N
        elemento36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento36ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento36, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 48, 45));

        elemento37.setBackground(new java.awt.Color(74, 74, 74));
        elemento37.setBorderPainted(false);
        elemento37.setName("rg"); // NOI18N
        elemento37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento37ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento37, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 48, 45));

        elemento38.setBackground(new java.awt.Color(74, 74, 74));
        elemento38.setBorderPainted(false);
        elemento38.setName("cu"); // NOI18N
        elemento38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento38ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento38, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 48, 45));

        elemento39.setBackground(new java.awt.Color(74, 74, 74));
        elemento39.setBorderPainted(false);
        elemento39.setName("ag"); // NOI18N
        elemento39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento39ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento39, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 48, 45));

        elemento40.setBackground(new java.awt.Color(74, 74, 74));
        elemento40.setBorderPainted(false);
        elemento40.setName("au"); // NOI18N
        elemento40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento40ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento40, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 48, 45));

        elemento41.setBackground(new java.awt.Color(74, 74, 74));
        elemento41.setBorderPainted(false);
        elemento41.setName("cn"); // NOI18N
        elemento41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento41ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento41, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 48, 45));

        elemento42.setBackground(new java.awt.Color(74, 74, 74));
        elemento42.setBorderPainted(false);
        elemento42.setName("zn"); // NOI18N
        elemento42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento42ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento42, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 48, 45));

        elemento43.setBackground(new java.awt.Color(74, 74, 74));
        elemento43.setBorderPainted(false);
        elemento43.setName("cd"); // NOI18N
        elemento43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento43ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento43, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 48, 45));

        elemento44.setBackground(new java.awt.Color(74, 74, 74));
        elemento44.setBorderPainted(false);
        elemento44.setName("hg"); // NOI18N
        elemento44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento44ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento44, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 48, 45));

        elemento45.setBackground(new java.awt.Color(74, 74, 74));
        elemento45.setBorderPainted(false);
        elemento45.setName("nh"); // NOI18N
        elemento45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento45ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento45, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 48, 45));

        elemento46.setBackground(new java.awt.Color(74, 74, 74));
        elemento46.setBorderPainted(false);
        elemento46.setName("tl"); // NOI18N
        elemento46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento46ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento46, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, 48, 45));

        elemento47.setBackground(new java.awt.Color(74, 74, 74));
        elemento47.setBorderPainted(false);
        elemento47.setName("in"); // NOI18N
        elemento47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento47ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento47, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 48, 45));

        elemento48.setBackground(new java.awt.Color(74, 74, 74));
        elemento48.setBorderPainted(false);
        elemento48.setName("ga"); // NOI18N
        elemento48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento48ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento48, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 48, 45));

        elemento49.setBackground(new java.awt.Color(74, 74, 74));
        elemento49.setBorderPainted(false);
        elemento49.setName("b"); // NOI18N
        elemento49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento49ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento49, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, 48, 45));

        elemento50.setBackground(new java.awt.Color(74, 74, 74));
        elemento50.setBorderPainted(false);
        elemento50.setName("al"); // NOI18N
        elemento50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento50ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento50, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 48, 45));

        elemento51.setBackground(new java.awt.Color(74, 74, 74));
        elemento51.setBorderPainted(false);
        elemento51.setName("fl"); // NOI18N
        elemento51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento51ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento51, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, 48, 45));

        elemento52.setBackground(new java.awt.Color(74, 74, 74));
        elemento52.setBorderPainted(false);
        elemento52.setName("pb"); // NOI18N
        elemento52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento52ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento52, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 310, 48, 45));

        elemento53.setBackground(new java.awt.Color(74, 74, 74));
        elemento53.setBorderPainted(false);
        elemento53.setName("sn"); // NOI18N
        elemento53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento53ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento53, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, 48, 45));

        elemento54.setBackground(new java.awt.Color(74, 74, 74));
        elemento54.setBorderPainted(false);
        elemento54.setName("ge"); // NOI18N
        elemento54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento54ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento54, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 210, 48, 45));

        elemento55.setBackground(new java.awt.Color(74, 74, 74));
        elemento55.setBorderPainted(false);
        elemento55.setName("c"); // NOI18N
        elemento55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento55ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento55, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, 48, 45));

        elemento56.setBackground(new java.awt.Color(74, 74, 74));
        elemento56.setBorderPainted(false);
        elemento56.setName("si"); // NOI18N
        elemento56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento56ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento56, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, 48, 45));

        elemento57.setBackground(new java.awt.Color(74, 74, 74));
        elemento57.setBorderPainted(false);
        elemento57.setName("mc"); // NOI18N
        elemento57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento57ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento57, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 360, 48, 45));

        elemento58.setBackground(new java.awt.Color(74, 74, 74));
        elemento58.setBorderPainted(false);
        elemento58.setName("bi"); // NOI18N
        elemento58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento58ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento58, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 310, 48, 45));

        elemento59.setBackground(new java.awt.Color(74, 74, 74));
        elemento59.setBorderPainted(false);
        elemento59.setName("sb"); // NOI18N
        elemento59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento59ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento59, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, 48, 45));

        elemento60.setBackground(new java.awt.Color(74, 74, 74));
        elemento60.setBorderPainted(false);
        elemento60.setName("as"); // NOI18N
        elemento60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento60ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento60, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 210, 48, 45));

        elemento61.setBackground(new java.awt.Color(74, 74, 74));
        elemento61.setBorderPainted(false);
        elemento61.setName("n"); // NOI18N
        elemento61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento61ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento61, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 110, 48, 45));

        elemento62.setBackground(new java.awt.Color(74, 74, 74));
        elemento62.setBorderPainted(false);
        elemento62.setName("p"); // NOI18N
        elemento62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento62ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento62, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 160, 48, 45));

        elemento63.setBackground(new java.awt.Color(74, 74, 74));
        elemento63.setBorderPainted(false);
        elemento63.setName("lv"); // NOI18N
        elemento63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento63ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento63, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 360, 48, 45));

        elemento64.setBackground(new java.awt.Color(74, 74, 74));
        elemento64.setBorderPainted(false);
        elemento64.setName("po"); // NOI18N
        elemento64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento64ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento64, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 310, 48, 45));

        elemento65.setBackground(new java.awt.Color(74, 74, 74));
        elemento65.setBorderPainted(false);
        elemento65.setName("te"); // NOI18N
        elemento65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento65ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento65, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 260, 48, 45));

        elemento66.setBackground(new java.awt.Color(74, 74, 74));
        elemento66.setBorderPainted(false);
        elemento66.setName("se"); // NOI18N
        elemento66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento66ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento66, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, 48, 45));

        elemento67.setBackground(new java.awt.Color(74, 74, 74));
        elemento67.setBorderPainted(false);
        elemento67.setName("o"); // NOI18N
        elemento67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento67ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento67, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 110, 48, 45));

        elemento68.setBackground(new java.awt.Color(74, 74, 74));
        elemento68.setBorderPainted(false);
        elemento68.setName("s"); // NOI18N
        elemento68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento68ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento68, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 160, 48, 45));

        elemento69.setBackground(new java.awt.Color(74, 74, 74));
        elemento69.setBorderPainted(false);
        elemento69.setName("ts"); // NOI18N
        elemento69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento69ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento69, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 360, 48, 45));

        elemento70.setBackground(new java.awt.Color(74, 74, 74));
        elemento70.setBorderPainted(false);
        elemento70.setName("at"); // NOI18N
        elemento70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento70ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento70, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 310, 48, 45));

        elemento71.setBackground(new java.awt.Color(74, 74, 74));
        elemento71.setBorderPainted(false);
        elemento71.setName("i"); // NOI18N
        elemento71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento71ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento71, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 260, 48, 45));

        elemento72.setBackground(new java.awt.Color(74, 74, 74));
        elemento72.setBorderPainted(false);
        elemento72.setName("br"); // NOI18N
        elemento72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento72ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento72, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 210, 48, 45));

        elemento73.setBackground(new java.awt.Color(74, 74, 74));
        elemento73.setBorderPainted(false);
        elemento73.setName("f"); // NOI18N
        elemento73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento73ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento73, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 110, 48, 45));

        elemento74.setBackground(new java.awt.Color(74, 74, 74));
        elemento74.setBorderPainted(false);
        elemento74.setName("cl"); // NOI18N
        elemento74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento74ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento74, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 160, 48, 45));

        elemento75.setBackground(new java.awt.Color(74, 74, 74));
        elemento75.setBorderPainted(false);
        elemento75.setName("og"); // NOI18N
        elemento75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento75ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento75, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 360, 48, 45));

        elemento76.setBackground(new java.awt.Color(74, 74, 74));
        elemento76.setBorderPainted(false);
        elemento76.setName("rn"); // NOI18N
        elemento76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento76ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento76, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 310, 48, 45));

        elemento77.setBackground(new java.awt.Color(74, 74, 74));
        elemento77.setBorderPainted(false);
        elemento77.setName("xe"); // NOI18N
        elemento77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento77ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento77, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 260, 48, 45));

        elemento78.setBackground(new java.awt.Color(74, 74, 74));
        elemento78.setBorderPainted(false);
        elemento78.setName("kr"); // NOI18N
        elemento78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento78ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento78, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 210, 48, 45));

        elemento79.setBackground(new java.awt.Color(74, 74, 74));
        elemento79.setBorderPainted(false);
        elemento79.setName("he"); // NOI18N
        elemento79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento79ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento79, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 60, 48, 45));

        elemento80.setBackground(new java.awt.Color(74, 74, 74));
        elemento80.setBorderPainted(false);
        elemento80.setName("ar"); // NOI18N
        elemento80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento80ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento80, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 160, 48, 45));

        elemento81.setBackground(new java.awt.Color(74, 74, 74));
        elemento81.setBorderPainted(false);
        elemento81.setName("ne"); // NOI18N
        elemento81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento81ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento81, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 110, 48, 45));

        elemento82.setBackground(new java.awt.Color(74, 74, 74));
        elemento82.setBorderPainted(false);
        elemento82.setName("la"); // NOI18N
        elemento82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento82ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento82, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 48, 45));

        elemento83.setBackground(new java.awt.Color(74, 74, 74));
        elemento83.setBorderPainted(false);
        elemento83.setName("yb"); // NOI18N
        elemento83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento83ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento83, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 430, 48, 45));

        elemento84.setBackground(new java.awt.Color(74, 74, 74));
        elemento84.setBorderPainted(false);
        elemento84.setName("tm"); // NOI18N
        elemento84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento84ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento84, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, 48, 45));

        elemento85.setBackground(new java.awt.Color(74, 74, 74));
        elemento85.setBorderPainted(false);
        elemento85.setName("er"); // NOI18N
        elemento85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento85ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento85, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 430, 48, 45));

        elemento86.setBackground(new java.awt.Color(74, 74, 74));
        elemento86.setBorderPainted(false);
        elemento86.setName("ho"); // NOI18N
        elemento86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento86ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento86, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, 48, 45));

        elemento87.setBackground(new java.awt.Color(74, 74, 74));
        elemento87.setBorderPainted(false);
        elemento87.setName("dy"); // NOI18N
        elemento87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento87ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento87, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, 48, 45));

        elemento88.setBackground(new java.awt.Color(74, 74, 74));
        elemento88.setBorderPainted(false);
        elemento88.setName("tb"); // NOI18N
        elemento88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento88ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento88, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, 48, 45));

        elemento89.setBackground(new java.awt.Color(74, 74, 74));
        elemento89.setBorderPainted(false);
        elemento89.setName("gd"); // NOI18N
        elemento89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento89ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento89, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 48, 45));

        elemento90.setBackground(new java.awt.Color(74, 74, 74));
        elemento90.setBorderPainted(false);
        elemento90.setName("eu"); // NOI18N
        elemento90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento90ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento90, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 48, 45));

        elemento91.setBackground(new java.awt.Color(74, 74, 74));
        elemento91.setBorderPainted(false);
        elemento91.setName("sm"); // NOI18N
        elemento91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento91ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento91, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 48, 45));

        elemento92.setBackground(new java.awt.Color(74, 74, 74));
        elemento92.setBorderPainted(false);
        elemento92.setName("pm"); // NOI18N
        elemento92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento92ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento92, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 48, 45));

        elemento93.setBackground(new java.awt.Color(74, 74, 74));
        elemento93.setBorderPainted(false);
        elemento93.setName("nd"); // NOI18N
        elemento93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento93ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento93, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 48, 45));

        elemento94.setBackground(new java.awt.Color(74, 74, 74));
        elemento94.setBorderPainted(false);
        elemento94.setName("pr"); // NOI18N
        elemento94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento94ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento94, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 48, 45));

        elemento95.setBackground(new java.awt.Color(74, 74, 74));
        elemento95.setBorderPainted(false);
        elemento95.setName("ce"); // NOI18N
        elemento95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento95ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento95, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 48, 45));

        elemento96.setBackground(new java.awt.Color(74, 74, 74));
        elemento96.setBorderPainted(false);
        elemento96.setName("am"); // NOI18N
        elemento96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento96ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento96, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 48, 45));

        elemento97.setBackground(new java.awt.Color(74, 74, 74));
        elemento97.setBorderPainted(false);
        elemento97.setName("cf"); // NOI18N
        elemento97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento97ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento97, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 480, 48, 45));

        elemento98.setBackground(new java.awt.Color(74, 74, 74));
        elemento98.setBorderPainted(false);
        elemento98.setName("es"); // NOI18N
        elemento98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento98ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento98, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 480, 48, 45));

        elemento99.setBackground(new java.awt.Color(74, 74, 74));
        elemento99.setBorderPainted(false);
        elemento99.setName("pa"); // NOI18N
        elemento99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento99ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento99, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 48, 45));

        elemento100.setBackground(new java.awt.Color(74, 74, 74));
        elemento100.setBorderPainted(false);
        elemento100.setName("th"); // NOI18N
        elemento100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento100ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento100, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 48, 45));

        elemento101.setBackground(new java.awt.Color(74, 74, 74));
        elemento101.setBorderPainted(false);
        elemento101.setName("md"); // NOI18N
        elemento101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento101ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento101, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 480, 48, 45));

        elemento102.setBackground(new java.awt.Color(74, 74, 74));
        elemento102.setBorderPainted(false);
        elemento102.setName("fm"); // NOI18N
        elemento102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento102ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento102, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 480, 48, 45));

        elemento103.setBackground(new java.awt.Color(74, 74, 74));
        elemento103.setBorderPainted(false);
        elemento103.setName("bk"); // NOI18N
        elemento103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento103ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento103, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, 48, 45));

        elemento104.setBackground(new java.awt.Color(74, 74, 74));
        elemento104.setBorderPainted(false);
        elemento104.setName("cm"); // NOI18N
        elemento104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento104ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento104, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 48, 45));

        elemento105.setBackground(new java.awt.Color(74, 74, 74));
        elemento105.setBorderPainted(false);
        elemento105.setName("u"); // NOI18N
        elemento105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento105ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento105, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 48, 45));

        elemento106.setBackground(new java.awt.Color(74, 74, 74));
        elemento106.setBorderPainted(false);
        elemento106.setName("pu"); // NOI18N
        elemento106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento106ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento106, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 48, 45));

        elemento107.setBackground(new java.awt.Color(74, 74, 74));
        elemento107.setBorderPainted(false);
        elemento107.setName("ac"); // NOI18N
        elemento107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento107ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento107, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 48, 45));

        elemento108.setBackground(new java.awt.Color(74, 74, 74));
        elemento108.setBorderPainted(false);
        elemento108.setName("np"); // NOI18N
        elemento108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento108ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento108, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, 48, 45));

        elemento109.setBackground(new java.awt.Color(74, 74, 74));
        elemento109.setBorderPainted(false);
        elemento109.setName("no"); // NOI18N
        elemento109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento109ActionPerformed(evt);
            }
        });
        getContentPane().add(elemento109, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 480, 48, 45));

        jButton1.setBackground(new java.awt.Color(253, 81, 75));
        jButton1.setFont(new java.awt.Font("Lakehurst Gothic Medium", 0, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(254, 254, 254));
        jButton1.setText("volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 630, -1, -1));

        jLabel9.setBackground(new java.awt.Color(254, 254, 254));
        jLabel9.setFont(new java.awt.Font("Elephant", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(254, 254, 254));
        jLabel9.setText("1");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 24, -1));

        jLabel10.setBackground(new java.awt.Color(254, 254, 254));
        jLabel10.setFont(new java.awt.Font("Elephant", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(254, 254, 254));
        jLabel10.setText("v1 b");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 24, -1));

        jLabel11.setBackground(new java.awt.Color(254, 254, 254));
        jLabel11.setFont(new java.awt.Font("Elephant", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(254, 254, 254));
        jLabel11.setText("vii b");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 24, -1));

        jLabel12.setBackground(new java.awt.Color(254, 254, 254));
        jLabel12.setFont(new java.awt.Font("Elephant", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(254, 254, 254));
        jLabel12.setText("viii b");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 30, -1));

        jLabel13.setBackground(new java.awt.Color(254, 254, 254));
        jLabel13.setFont(new java.awt.Font("Elephant", 0, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(254, 254, 254));
        jLabel13.setText("I A");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 24, -1));

        jLabel14.setBackground(new java.awt.Color(254, 254, 254));
        jLabel14.setFont(new java.awt.Font("Elephant", 0, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(254, 254, 254));
        jLabel14.setText("v b");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 24, -1));

        jLabel15.setBackground(new java.awt.Color(254, 254, 254));
        jLabel15.setFont(new java.awt.Font("Elephant", 0, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(254, 254, 254));
        jLabel15.setText("iv b");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 24, -1));

        jLabel16.setBackground(new java.awt.Color(254, 254, 254));
        jLabel16.setFont(new java.awt.Font("Elephant", 0, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(254, 254, 254));
        jLabel16.setText("iii B");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 24, -1));

        jLabel17.setBackground(new java.awt.Color(254, 254, 254));
        jLabel17.setFont(new java.awt.Font("Elephant", 0, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(254, 254, 254));
        jLabel17.setText("ii b");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 24, -1));

        jLabel18.setBackground(new java.awt.Color(254, 254, 254));
        jLabel18.setFont(new java.awt.Font("Elephant", 0, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(254, 254, 254));
        jLabel18.setText("i b");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 24, -1));

        jLabel19.setBackground(new java.awt.Color(254, 254, 254));
        jLabel19.setFont(new java.awt.Font("Elephant", 0, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(254, 254, 254));
        jLabel19.setText("viii b");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 190, 30, -1));

        jLabel20.setBackground(new java.awt.Color(254, 254, 254));
        jLabel20.setFont(new java.awt.Font("Elephant", 0, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(254, 254, 254));
        jLabel20.setText("viii b");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 190, 30, -1));

        jLabel21.setBackground(new java.awt.Color(254, 254, 254));
        jLabel21.setFont(new java.awt.Font("Elephant", 0, 15)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(254, 254, 254));
        jLabel21.setText("viii a");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 40, 24, -1));

        jLabel22.setBackground(new java.awt.Color(254, 254, 254));
        jLabel22.setFont(new java.awt.Font("Elephant", 0, 15)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(254, 254, 254));
        jLabel22.setText("vi a");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 90, 24, -1));

        jLabel23.setBackground(new java.awt.Color(254, 254, 254));
        jLabel23.setFont(new java.awt.Font("Elephant", 0, 15)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(254, 254, 254));
        jLabel23.setText("v a");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, 24, -1));

        jLabel24.setBackground(new java.awt.Color(254, 254, 254));
        jLabel24.setFont(new java.awt.Font("Elephant", 0, 15)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(254, 254, 254));
        jLabel24.setText("iv a");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 24, -1));

        jLabel25.setBackground(new java.awt.Color(254, 254, 254));
        jLabel25.setFont(new java.awt.Font("Elephant", 0, 15)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(254, 254, 254));
        jLabel25.setText("iii a");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, 24, -1));

        jLabel26.setBackground(new java.awt.Color(254, 254, 254));
        jLabel26.setFont(new java.awt.Font("Elephant", 0, 15)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(254, 254, 254));
        jLabel26.setText("vii a");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 90, 24, -1));

        jLabel8.setBackground(new java.awt.Color(33, 33, 33));
        jLabel8.setForeground(new java.awt.Color(44, 44, 44));
        jLabel8.setName("H"); // NOI18N
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 1370, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HActionPerformed

    private void LitioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LitioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LitioActionPerformed

    private void FrancioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrancioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FrancioActionPerformed

    private void SodioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SodioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SodioActionPerformed

    private void PotasioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PotasioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PotasioActionPerformed

    private void RubidioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RubidioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RubidioActionPerformed

    private void CesioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CesioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CesioActionPerformed

    private void BerilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BerilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BerilioActionPerformed

    private void elementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elementoActionPerformed

    private void elemento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento1ActionPerformed

    private void elemento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento2ActionPerformed

    private void elemento3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento3ActionPerformed

    private void elemento4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento4ActionPerformed

    private void elemento5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento5ActionPerformed

    private void elemento6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento6ActionPerformed

    private void elemento7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento7ActionPerformed

    private void elemento8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento8ActionPerformed

    private void elemento9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento9ActionPerformed

    private void elemento10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento10ActionPerformed

    private void elemento11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento11ActionPerformed

    private void elemento12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento12ActionPerformed

    private void elemento13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento13ActionPerformed

    private void elemento14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento14ActionPerformed

    private void elemento15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento15ActionPerformed

    private void elemento16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento16ActionPerformed

    private void elemento17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento17ActionPerformed

    private void elemento18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento18ActionPerformed

    private void elemento19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento19ActionPerformed

    private void elemento20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento20ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_elemento20ActionPerformed

    private void elemento21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento21ActionPerformed

    private void elemento22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento22ActionPerformed

    private void elemento23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento23ActionPerformed

    private void elemento24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento24ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_elemento24ActionPerformed

    private void elemento25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento25ActionPerformed

    private void elemento26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento26ActionPerformed

    private void elemento27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento27ActionPerformed

    private void elemento28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento28ActionPerformed

    private void elemento29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento29ActionPerformed

    private void elemento30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento30ActionPerformed

    private void elemento31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento31ActionPerformed

    private void elemento32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento32ActionPerformed

    private void elemento33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento33ActionPerformed

    private void elemento34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento34ActionPerformed

    private void elemento35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento35ActionPerformed

    private void elemento36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento36ActionPerformed

    private void elemento37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento37ActionPerformed

    private void elemento38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento38ActionPerformed

    private void elemento39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento39ActionPerformed

    private void elemento40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento40ActionPerformed

    private void elemento41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento41ActionPerformed

    private void elemento42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento42ActionPerformed

    private void elemento43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento43ActionPerformed

    private void elemento44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento44ActionPerformed

    private void elemento45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento45ActionPerformed

    private void elemento46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento46ActionPerformed

    private void elemento47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento47ActionPerformed

    private void elemento48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento48ActionPerformed

    private void elemento49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento49ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento49ActionPerformed

    private void elemento50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento50ActionPerformed

    private void elemento51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento51ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento51ActionPerformed

    private void elemento52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento52ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento52ActionPerformed

    private void elemento53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento53ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento53ActionPerformed

    private void elemento54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento54ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento54ActionPerformed

    private void elemento55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento55ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento55ActionPerformed

    private void elemento56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento56ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento56ActionPerformed

    private void elemento57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento57ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento57ActionPerformed

    private void elemento58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento58ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento58ActionPerformed

    private void elemento59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento59ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento59ActionPerformed

    private void elemento60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento60ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento60ActionPerformed

    private void elemento61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento61ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento61ActionPerformed

    private void elemento62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento62ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento62ActionPerformed

    private void elemento63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento63ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento63ActionPerformed

    private void elemento64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento64ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento64ActionPerformed

    private void elemento65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento65ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento65ActionPerformed

    private void elemento66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento66ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento66ActionPerformed

    private void elemento67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento67ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento67ActionPerformed

    private void elemento68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento68ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento68ActionPerformed

    private void elemento69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento69ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento69ActionPerformed

    private void elemento70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento70ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento70ActionPerformed

    private void elemento71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento71ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento71ActionPerformed

    private void elemento72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento72ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento72ActionPerformed

    private void elemento73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento73ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento73ActionPerformed

    private void elemento74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento74ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento74ActionPerformed

    private void elemento75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento75ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento75ActionPerformed

    private void elemento76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento76ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento76ActionPerformed

    private void elemento77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento77ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento77ActionPerformed

    private void elemento78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento78ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento78ActionPerformed

    private void elemento79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento79ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento79ActionPerformed

    private void elemento80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento80ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento80ActionPerformed

    private void elemento81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento81ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento81ActionPerformed

    private void elemento82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento82ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento82ActionPerformed

    private void elemento83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento83ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento83ActionPerformed

    private void elemento84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento84ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento84ActionPerformed

    private void elemento85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento85ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento85ActionPerformed

    private void elemento86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento86ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento86ActionPerformed

    private void elemento87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento87ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento87ActionPerformed

    private void elemento88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento88ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento88ActionPerformed

    private void elemento89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento89ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento89ActionPerformed

    private void elemento90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento90ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento90ActionPerformed

    private void elemento91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento91ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento91ActionPerformed

    private void elemento92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento92ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento92ActionPerformed

    private void elemento93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento93ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento93ActionPerformed

    private void elemento94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento94ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento94ActionPerformed

    private void elemento95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento95ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento95ActionPerformed

    private void elemento96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento96ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento96ActionPerformed

    private void elemento97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento97ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento97ActionPerformed

    private void elemento98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento98ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento98ActionPerformed

    private void elemento99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento99ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento99ActionPerformed

    private void elemento100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento100ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento100ActionPerformed

    private void elemento101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento101ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento101ActionPerformed

    private void elemento102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento102ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento102ActionPerformed

    private void elemento103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento103ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento103ActionPerformed

    private void elemento104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento104ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento104ActionPerformed

    private void elemento105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento105ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento105ActionPerformed

    private void elemento106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento106ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento106ActionPerformed

    private void elemento107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento107ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento107ActionPerformed

    private void elemento108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento108ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento108ActionPerformed

    private void elemento109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemento109ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemento109ActionPerformed

    private void HMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_HMouseReleased

    private void jLabel36MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseEntered
        // TODO add your handling code here:
        Gnobles.setVisible(true);
        halogenos.setVisible(true);
        metaloides.setVisible(true);
        GNobles.setVisible(true);
        Otrmetales.setVisible(true);
        alcalinoterreos.setVisible(true);
        Malcalinos.setVisible(true);
        nometales.setVisible(true);
        nometales2.setVisible(true);
        Mtransicion.setVisible(false);
        lantanidos.setVisible(true);
        actinidos.setVisible(true);
    }//GEN-LAST:event_jLabel36MouseEntered

    private void jLabel36MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseExited
        // TODO add your handling code here:
        GNobles.setVisible(false);
        halogenos.setVisible(false);
        metaloides.setVisible(false);
        Gnobles.setVisible(false);
        Otrmetales.setVisible(false);
        alcalinoterreos.setVisible(false);
        Malcalinos.setVisible(false);
        nometales.setVisible(false);
        nometales2.setVisible(false);
        Mtransicion.setVisible(false);
        lantanidos.setVisible(false);
        actinidos.setVisible(false);
    }//GEN-LAST:event_jLabel36MouseExited

    private void jLabel28MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseEntered
        // TODO add your handling code here:
        GNobles.setVisible(false);
        halogenos.setVisible(true);
        metaloides.setVisible(true);
        Gnobles.setVisible(false);
        Otrmetales.setVisible(true);
        alcalinoterreos.setVisible(true);
        Malcalinos.setVisible(true);
        nometales.setVisible(true);
        nometales2.setVisible(true);
        Mtransicion.setVisible(true);
        lantanidos.setVisible(true);
        actinidos.setVisible(true);
    }//GEN-LAST:event_jLabel28MouseEntered

    private void jLabel28MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseExited
        // TODO add your handling code here:
        Gnobles.setVisible(false);
        halogenos.setVisible(false);
        metaloides.setVisible(false);
        GNobles.setVisible(false);
        Otrmetales.setVisible(false);
        alcalinoterreos.setVisible(false);
        Malcalinos.setVisible(false);
        nometales.setVisible(false);
        nometales2.setVisible(false);
        Mtransicion.setVisible(false);
        lantanidos.setVisible(false);
        actinidos.setVisible(false);
    }//GEN-LAST:event_jLabel28MouseExited

    private void jLabel29MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseEntered
        // TODO add your handling code here:
        Gnobles.setVisible(true);
        halogenos.setVisible(false);
        metaloides.setVisible(true);
        GNobles.setVisible(true);
        Otrmetales.setVisible(true);
        alcalinoterreos.setVisible(true);
        Malcalinos.setVisible(true);
        nometales.setVisible(true);
        nometales2.setVisible(true);
        Mtransicion.setVisible(true);
        lantanidos.setVisible(true);
        actinidos.setVisible(true);

    }//GEN-LAST:event_jLabel29MouseEntered

    private void jLabel29MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseExited
        // TODO add your handling code here:
        Gnobles.setVisible(false);
        halogenos.setVisible(false);
        metaloides.setVisible(false);
        GNobles.setVisible(false);
        Otrmetales.setVisible(false);
        alcalinoterreos.setVisible(false);
        Malcalinos.setVisible(false);
        nometales.setVisible(false);
        nometales2.setVisible(false);
        Mtransicion.setVisible(false);
        lantanidos.setVisible(false);
        actinidos.setVisible(false);
    }//GEN-LAST:event_jLabel29MouseExited

    private void jLabel30MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseEntered
        // TODO add your handling code here:
        Gnobles.setVisible(true);
        halogenos.setVisible(true);
        metaloides.setVisible(true);
        GNobles.setVisible(true);
        Otrmetales.setVisible(true);
        alcalinoterreos.setVisible(true);
        Malcalinos.setVisible(true);
        nometales.setVisible(false);
        nometales2.setVisible(false);
        Mtransicion.setVisible(true);
        lantanidos.setVisible(true);
        actinidos.setVisible(true);
    }//GEN-LAST:event_jLabel30MouseEntered

    private void jLabel30MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseExited
        // TODO add your handling code here:
        Gnobles.setVisible(false);
        halogenos.setVisible(false);
        metaloides.setVisible(false);
        GNobles.setVisible(false);
        Otrmetales.setVisible(false);
        alcalinoterreos.setVisible(false);
        Malcalinos.setVisible(false);
        nometales.setVisible(false);
        nometales2.setVisible(false);
        Mtransicion.setVisible(false);
        lantanidos.setVisible(false);
        actinidos.setVisible(false);
    }//GEN-LAST:event_jLabel30MouseExited

    private void jLabel31MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseEntered
        // TODO add your handling code here:
        Gnobles.setVisible(true);
        halogenos.setVisible(true);
        metaloides.setVisible(false);
        GNobles.setVisible(true);
        Otrmetales.setVisible(true);
        alcalinoterreos.setVisible(true);
        Malcalinos.setVisible(true);
        nometales.setVisible(true);
        nometales2.setVisible(true);
        Mtransicion.setVisible(true);
        lantanidos.setVisible(true);
        actinidos.setVisible(true);
    }//GEN-LAST:event_jLabel31MouseEntered

    private void jLabel31MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseExited
        // TODO add your handling code here:
        Gnobles.setVisible(false);
        halogenos.setVisible(false);
        metaloides.setVisible(false);
        GNobles.setVisible(false);
        Otrmetales.setVisible(false);
        alcalinoterreos.setVisible(false);
        Malcalinos.setVisible(false);
        nometales.setVisible(false);
        nometales2.setVisible(false);
        Mtransicion.setVisible(false);
        lantanidos.setVisible(false);
        actinidos.setVisible(false);
    }//GEN-LAST:event_jLabel31MouseExited

    private void jLabel27MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseEntered
        // TODO add your handling code here:
        Gnobles.setVisible(true);
        halogenos.setVisible(true);
        metaloides.setVisible(true);
        GNobles.setVisible(true);
        Otrmetales.setVisible(false);
        alcalinoterreos.setVisible(true);
        Malcalinos.setVisible(true);
        nometales.setVisible(true);
        nometales2.setVisible(true);
        Mtransicion.setVisible(true);
        lantanidos.setVisible(true);
        actinidos.setVisible(true);
    }//GEN-LAST:event_jLabel27MouseEntered

    private void jLabel27MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseExited
        // TODO add your handling code here:
        Gnobles.setVisible(false);
        halogenos.setVisible(false);
        metaloides.setVisible(false);
        GNobles.setVisible(false);
        Otrmetales.setVisible(false);
        alcalinoterreos.setVisible(false);
        Malcalinos.setVisible(false);
        nometales.setVisible(false);
        nometales2.setVisible(false);
        Mtransicion.setVisible(false);
        lantanidos.setVisible(false);
        actinidos.setVisible(false);
    }//GEN-LAST:event_jLabel27MouseExited

    private void jLabel35MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseEntered
        // TODO add your handling code here:
        Gnobles.setVisible(true);
        halogenos.setVisible(true);
        metaloides.setVisible(true);
        GNobles.setVisible(true);
        Otrmetales.setVisible(true);
        alcalinoterreos.setVisible(false);
        Malcalinos.setVisible(true);
        nometales.setVisible(true);
        nometales2.setVisible(true);
        Mtransicion.setVisible(true);
        lantanidos.setVisible(true);
        actinidos.setVisible(true);
    }//GEN-LAST:event_jLabel35MouseEntered

    private void jLabel35MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseExited
        // TODO add your handling code here:
        Gnobles.setVisible(false);
        halogenos.setVisible(false);
        metaloides.setVisible(false);
        GNobles.setVisible(false);
        Otrmetales.setVisible(false);
        alcalinoterreos.setVisible(false);
        Malcalinos.setVisible(false);
        nometales.setVisible(false);
        nometales2.setVisible(false);
        Mtransicion.setVisible(false);
        lantanidos.setVisible(false);
        actinidos.setVisible(false);
    }//GEN-LAST:event_jLabel35MouseExited

    private void jLabel34MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseEntered
        // TODO add your handling code here:
        Gnobles.setVisible(true);
        halogenos.setVisible(true);
        metaloides.setVisible(true);
        GNobles.setVisible(true);
        Otrmetales.setVisible(true);
        alcalinoterreos.setVisible(true);
        Malcalinos.setVisible(false);
        nometales.setVisible(true);
        nometales2.setVisible(true);
        Mtransicion.setVisible(true);
        lantanidos.setVisible(true);
        actinidos.setVisible(true);
    }//GEN-LAST:event_jLabel34MouseEntered

    private void jLabel34MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseExited
        // TODO add your handling code here:
        Gnobles.setVisible(false);
        halogenos.setVisible(false);
        metaloides.setVisible(false);
        GNobles.setVisible(false);
        Otrmetales.setVisible(false);
        alcalinoterreos.setVisible(false);
        Malcalinos.setVisible(false);
        nometales.setVisible(false);
        nometales2.setVisible(false);
        Mtransicion.setVisible(false);
        lantanidos.setVisible(false);
        actinidos.setVisible(false);
    }//GEN-LAST:event_jLabel34MouseExited

    private void jLabel33MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseEntered
        // TODO add your handling code here:
        Gnobles.setVisible(true);
        halogenos.setVisible(true);
        metaloides.setVisible(true);
        GNobles.setVisible(true);
        Otrmetales.setVisible(true);
        alcalinoterreos.setVisible(true);
        Malcalinos.setVisible(true);
        nometales.setVisible(true);
        nometales2.setVisible(true);
        Mtransicion.setVisible(true);
        lantanidos.setVisible(false);
        actinidos.setVisible(true);
    }//GEN-LAST:event_jLabel33MouseEntered

    private void jLabel33MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseExited
        // TODO add your handling code here:
        Gnobles.setVisible(false);
        halogenos.setVisible(false);
        metaloides.setVisible(false);
        GNobles.setVisible(false);
        Otrmetales.setVisible(false);
        alcalinoterreos.setVisible(false);
        Malcalinos.setVisible(false);
        nometales.setVisible(false);
        nometales2.setVisible(false);
        Mtransicion.setVisible(false);
        lantanidos.setVisible(false);
        actinidos.setVisible(false);
    }//GEN-LAST:event_jLabel33MouseExited

    private void jLabel32MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseEntered
        // TODO add your handling code here:
        Gnobles.setVisible(true);
        halogenos.setVisible(true);
        metaloides.setVisible(true);
        GNobles.setVisible(true);
        Otrmetales.setVisible(true);
        alcalinoterreos.setVisible(true);
        Malcalinos.setVisible(true);
        nometales.setVisible(true);
        nometales2.setVisible(true);
        Mtransicion.setVisible(true);
        lantanidos.setVisible(true);
        actinidos.setVisible(false);
    }//GEN-LAST:event_jLabel32MouseEntered

    private void jLabel32MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseExited
        // TODO add your handling code here:
        Gnobles.setVisible(false);
        halogenos.setVisible(false);
        metaloides.setVisible(false);
        GNobles.setVisible(false);
        Otrmetales.setVisible(false);
        alcalinoterreos.setVisible(false);
        Malcalinos.setVisible(false);
        nometales.setVisible(false);
        nometales2.setVisible(false);
        Mtransicion.setVisible(false);
        lantanidos.setVisible(false);
        actinidos.setVisible(false);
    }//GEN-LAST:event_jLabel32MouseExited

    private void btelectroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btelectroActionPerformed
        // TODO add your handling code here:
        if(btelectro.isSelected()){
            Ele.setVisible(true);
        }else{
            Ele.setVisible(false);
        }
        
    }//GEN-LAST:event_btelectroActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        
        if(jToggleButton1.isSelected()){
            jLabel37.setVisible(true);
        }else{
            jLabel37.setVisible(false);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        inicio window = new inicio();
        window.setTitle("Tabla-Periodica-De-Los-Elementos");
        window.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Berilio;
    private javax.swing.JButton Cesio;
    private javax.swing.JLabel Ele;
    private javax.swing.JButton Francio;
    private javax.swing.JLabel GNobles;
    private javax.swing.JLabel Gnobles;
    private javax.swing.JButton H;
    private javax.swing.JButton Litio;
    private javax.swing.JLabel Malcalinos;
    private javax.swing.JLabel Mtransicion;
    private javax.swing.JLabel Otrmetales;
    private javax.swing.JButton Potasio;
    private javax.swing.JButton Rubidio;
    private javax.swing.JButton Sodio;
    private javax.swing.JLabel actinidos;
    private javax.swing.JLabel alcalinoterreos;
    private javax.swing.JToggleButton btelectro;
    private javax.swing.JButton elemento;
    private javax.swing.JButton elemento1;
    private javax.swing.JButton elemento10;
    private javax.swing.JButton elemento100;
    private javax.swing.JButton elemento101;
    private javax.swing.JButton elemento102;
    private javax.swing.JButton elemento103;
    private javax.swing.JButton elemento104;
    private javax.swing.JButton elemento105;
    private javax.swing.JButton elemento106;
    private javax.swing.JButton elemento107;
    private javax.swing.JButton elemento108;
    private javax.swing.JButton elemento109;
    private javax.swing.JButton elemento11;
    private javax.swing.JButton elemento12;
    private javax.swing.JButton elemento13;
    private javax.swing.JButton elemento14;
    private javax.swing.JButton elemento15;
    private javax.swing.JButton elemento16;
    private javax.swing.JButton elemento17;
    private javax.swing.JButton elemento18;
    private javax.swing.JButton elemento19;
    private javax.swing.JButton elemento2;
    private javax.swing.JButton elemento20;
    private javax.swing.JButton elemento21;
    private javax.swing.JButton elemento22;
    private javax.swing.JButton elemento23;
    private javax.swing.JButton elemento24;
    private javax.swing.JButton elemento25;
    private javax.swing.JButton elemento26;
    private javax.swing.JButton elemento27;
    private javax.swing.JButton elemento28;
    private javax.swing.JButton elemento29;
    private javax.swing.JButton elemento3;
    private javax.swing.JButton elemento30;
    private javax.swing.JButton elemento31;
    private javax.swing.JButton elemento32;
    private javax.swing.JButton elemento33;
    private javax.swing.JButton elemento34;
    private javax.swing.JButton elemento35;
    private javax.swing.JButton elemento36;
    private javax.swing.JButton elemento37;
    private javax.swing.JButton elemento38;
    private javax.swing.JButton elemento39;
    private javax.swing.JButton elemento4;
    private javax.swing.JButton elemento40;
    private javax.swing.JButton elemento41;
    private javax.swing.JButton elemento42;
    private javax.swing.JButton elemento43;
    private javax.swing.JButton elemento44;
    private javax.swing.JButton elemento45;
    private javax.swing.JButton elemento46;
    private javax.swing.JButton elemento47;
    private javax.swing.JButton elemento48;
    private javax.swing.JButton elemento49;
    private javax.swing.JButton elemento5;
    private javax.swing.JButton elemento50;
    private javax.swing.JButton elemento51;
    private javax.swing.JButton elemento52;
    private javax.swing.JButton elemento53;
    private javax.swing.JButton elemento54;
    private javax.swing.JButton elemento55;
    private javax.swing.JButton elemento56;
    private javax.swing.JButton elemento57;
    private javax.swing.JButton elemento58;
    private javax.swing.JButton elemento59;
    private javax.swing.JButton elemento6;
    private javax.swing.JButton elemento60;
    private javax.swing.JButton elemento61;
    private javax.swing.JButton elemento62;
    private javax.swing.JButton elemento63;
    private javax.swing.JButton elemento64;
    private javax.swing.JButton elemento65;
    private javax.swing.JButton elemento66;
    private javax.swing.JButton elemento67;
    private javax.swing.JButton elemento68;
    private javax.swing.JButton elemento69;
    private javax.swing.JButton elemento7;
    private javax.swing.JButton elemento70;
    private javax.swing.JButton elemento71;
    private javax.swing.JButton elemento72;
    private javax.swing.JButton elemento73;
    private javax.swing.JButton elemento74;
    private javax.swing.JButton elemento75;
    private javax.swing.JButton elemento76;
    private javax.swing.JButton elemento77;
    private javax.swing.JButton elemento78;
    private javax.swing.JButton elemento79;
    private javax.swing.JButton elemento8;
    private javax.swing.JButton elemento80;
    private javax.swing.JButton elemento81;
    private javax.swing.JButton elemento82;
    private javax.swing.JButton elemento83;
    private javax.swing.JButton elemento84;
    private javax.swing.JButton elemento85;
    private javax.swing.JButton elemento86;
    private javax.swing.JButton elemento87;
    private javax.swing.JButton elemento88;
    private javax.swing.JButton elemento89;
    private javax.swing.JButton elemento9;
    private javax.swing.JButton elemento90;
    private javax.swing.JButton elemento91;
    private javax.swing.JButton elemento92;
    private javax.swing.JButton elemento93;
    private javax.swing.JButton elemento94;
    private javax.swing.JButton elemento95;
    private javax.swing.JButton elemento96;
    private javax.swing.JButton elemento97;
    private javax.swing.JButton elemento98;
    private javax.swing.JButton elemento99;
    private javax.swing.JLabel halogenos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lantanidos;
    private javax.swing.JLabel metaloides;
    private javax.swing.JLabel nometales;
    private javax.swing.JLabel nometales2;
    // End of variables declaration//GEN-END:variables
}
