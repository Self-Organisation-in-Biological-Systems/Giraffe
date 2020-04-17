package org.ca;

public class Giraffe {

    public static void main(String[] args) {
        Giraffe g = new Giraffe();
        g.run();
    }

    private void run() {
        ControlFrame controlFrame = new ControlFrame();

        GraphicFrame graphic = new GraphicFrame(controlFrame);
        graphic.createGraphicFrame();

        Tick tick = new Tick(controlFrame, graphic);
        controlFrame.addButtonActionListeners(tick);
    }
}

//https://www.mpawars.com/post/do-you-know-nature-also-likes-to-stay-in-order

//https://www.groundai.com/project/from-natural-to-artificial-camouflage-components-and-systems/1
//https://www.groundai.com/project/distributed-camouflage-for-swarm-robotics-and-smart-materials/1
//zebra stripe and spot patterns generated by a local activator-inhibitor model [young1984local]

//Another discrete, local activator-inhibitor model for pattern formation that assumes only
// local cell interactions is known as Young’s model citeyoung1984local. In the model, activator
// and inhibitor mophorgens are defined with different shape around each pigment cell.
// With specifically definded morphogens, Young’s model can generate mottles of different sizes or
// stripes of different thickness and directions

//https://github.com/benjamminf/warpjs - vector based
//warp, fisheye, morph
