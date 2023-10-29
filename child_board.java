import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class child_board extends Applet implements ActionListener
{
	AudioClip ag1;
    Image img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12,img13,img14,img15,img16,img17,img18,img19,img20,img21,img22,img23,img24,img25,img26;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26;
	int a=0;
	int b=0;
	int c=0;
	int d=0;
	int e1=0;
	int f=0;
	int g2=0;
	int h=0;
	int i=0;
	int j=0;
	int k=0;
    int l=0;
    int m=0;
    int n=0;
    int o=0;
    int p=0;
    int q=0;
    int r=0;
    int s=0;
    int t=0;
    int u=0;
    int v=0;
    int w=0;
    int x=0;
    int y=0;
    int z=0;
	public void init()
	{
	    img1 = getImage(getDocumentBase(),"apple.jpg");
	   	img2 = getImage(getDocumentBase(),"ball.jpg");
	   	img3 = getImage(getDocumentBase(),"cat.jpg");
	   	img4 = getImage(getDocumentBase(),"dog.jpg");
	   	img5 = getImage(getDocumentBase(),"elephant.jpg");
	   	img6 = getImage(getDocumentBase(),"fish.jpg");
	   	img7 = getImage(getDocumentBase(),"grape.jpg");
	   	img8 = getImage(getDocumentBase(),"hen.jpg");
	   	img9 = getImage(getDocumentBase(),"icecream.jpg");
	   	img10 = getImage(getDocumentBase(),"jug.jpg");
	   	img11 = getImage(getDocumentBase(),"kite.jpg");
	   	img12 = getImage(getDocumentBase(),"lion.jpg");
	   	img13 = getImage(getDocumentBase(),"monkey.jpg");
	   	img14 = getImage(getDocumentBase(),"nest.jpg");
	   	img15 = getImage(getDocumentBase(),"owl.jpg");
	   	img16 = getImage(getDocumentBase(),"parrot.jpg");
	   	img17 = getImage(getDocumentBase(),"queen.jpg");
	   	img18 = getImage(getDocumentBase(),"rabbit.jpg");
	   	img19 = getImage(getDocumentBase(),"ship.jpg");
	   	img20 = getImage(getDocumentBase(),"television.jpg");
	   	img21 = getImage(getDocumentBase(),"umbrella.jpg");
	   	img22 = getImage(getDocumentBase(),"van.jpg");
	   	img23 = getImage(getDocumentBase(),"whale.jpg");
	   	img24 = getImage(getDocumentBase(),"x-mastree.jpg");
	   	img25 = getImage(getDocumentBase(),"yak.jpg");
	   	img26 = getImage(getDocumentBase(),"zebra.jpg");

	   	ag1 = getAudioClip(getDocumentBase(),"apple.wav");

	b1 = new Button("A");
    b2 = new Button("B");
    b3 = new Button("C");
    b4 = new Button("D");
    b5 = new Button("E");
    b6 = new Button("F");
    b7 = new Button("G");
    b8 = new Button("H");
    b9 = new Button("I");
    b10 = new Button("J");
    b11 = new Button("K");
    b12 = new Button("L");
    b13 = new Button("M");
    b14 = new Button("N");
    b15 = new Button("O");
    b16 = new Button("P");
    b17 = new Button("Q");
    b18 = new Button("R");
    b19 = new Button("S");
    b20 = new Button("T");
    b21 = new Button("U");
    b22 = new Button("V");
    b23 = new Button("W");
    b24 = new Button("X");
    b25 = new Button("Y");
    b26 = new Button("Z");
     add(b1);
     add(b2);
     add(b3);
     add(b4);
     add(b5);
     add(b6);
     add(b7);
     add(b8);
     add(b9);
     add(b10);
     add(b11);
     add(b12);
     add(b13);
     add(b14);
     add(b15);
     add(b16);
     add(b17);
     add(b18);
     add(b19);
     add(b20);
     add(b21);
     add(b22);
     add(b23);
     add(b24);
     add(b25);
     add(b26);
     b1.addActionListener(this);
     b2.addActionListener(this);
     b3.addActionListener(this);
     b4.addActionListener(this);
     b5.addActionListener(this);
     b6.addActionListener(this);
     b7.addActionListener(this);
     b8.addActionListener(this);
     b9.addActionListener(this);
     b10.addActionListener(this);
     b11.addActionListener(this);
     b12.addActionListener(this);
     b13.addActionListener(this);
     b14.addActionListener(this);
     b15.addActionListener(this);
     b16.addActionListener(this);
     b17.addActionListener(this);
     b18.addActionListener(this);
     b19.addActionListener(this);
     b20.addActionListener(this);
     b21.addActionListener(this);
     b22.addActionListener(this);
     b23.addActionListener(this);
     b24.addActionListener(this);
     b25.addActionListener(this);
     b26.addActionListener(this); 
	}
	public void paint(Graphics g)
	{	
		if(a==1)
		{
			g.drawImage(img1,100,100,this);
			ag1.play();
			Font f1 = new Font("Arial",Font.BOLD,250);
	        g.setFont(f1);

	        g.setColor(Color.red);
	        g.drawString("A",800,250);
	        g.drawString("for",800,500);
	        g.drawString("APPLE",800,800);

		}
		if(b==1)
		{
			g.drawImage(img2,100,100,this);
			Font f1 = new Font("Arial",Font.BOLD,250);
	        g.setFont(f1);
            
	        Color c= new Color(19,113,23);
            g.setColor(c);
	        g.drawString("B",800,250);
	        g.drawString("for",800,500);
	        g.drawString("BALL",800,800);
		}
		if(c==1)
		{
            g.drawImage(img3,100,100,this);
            Font f1 = new Font("Arial",Font.BOLD,250);
	        g.setFont(f1);

	        Color c= new Color(157,98,66);
            g.setColor(c);
	        g.drawString("C",800,250);
	        g.drawString("for",800,500);
	        g.drawString("CAT",800,800);
		}
		if(d==1)
		{
			g.drawImage(img4,100,100,this);

			Font f1 = new Font("Arial",Font.BOLD,250);
	        g.setFont(f1);

	        Color c= new Color(125,39,6);
            g.setColor(c);
	        g.drawString("D",800,250);
	        g.drawString("for",800,500);
	        g.drawString("DOG",800,800);
		}
		if(e1==1)
		{
			g.drawImage(img5,100,100,this);

			Font f1 = new Font("Arial",Font.BOLD,220);
	        g.setFont(f1);

	        Color c= new Color(107,107,107);
            g.setColor(c);
	        g.drawString("E",680,250);
	        g.drawString("for",680,500);
	        g.drawString("ELEPHANT",680,800);
		}
		if(f==1)
		{
			g.drawImage(img6,100,100,this);
			Font f1 = new Font("Arial",Font.BOLD,250);
	        g.setFont(f1);

	        Color c= new Color(255,128,0);
            g.setColor(c);
	        g.drawString("F",800,250);
	        g.drawString("for",800,500);
	        g.drawString("FISH",800,800);

		}
		if(g2==1)
		{
			g.drawImage(img7,100,100,this);

			Font f1 = new Font("Arial",Font.BOLD,250);
	        g.setFont(f1);

	        Color c= new Color(86,14,114);
            g.setColor(c);
	        g.drawString("G",800,250);
	        g.drawString("for",800,500);
	        g.drawString("GRAPE",800,800);
		}
		if(h==1)
		{
			g.drawImage(img8,100,100,this);

			Font f1 = new Font("Arial",Font.BOLD,250);
	        g.setFont(f1);

	        Color c= new Color(191,96,0);
            g.setColor(c);
	        g.drawString("H",800,250);
	        g.drawString("for",800,500);
	        g.drawString("HEN",800,800);
		}
		if(i==1)
		{
			g.drawImage(img9,100,100,this);

			Font f1 = new Font("Arial",Font.BOLD,190);
	        g.setFont(f1);

	        Color c= new Color(255,47,151);
            g.setColor(c);
	        g.drawString("I",730,250);
	        g.drawString("for",730,500);
	        g.drawString("ICE CREAM",730,800);
		}
		if(j==1)
		{
			g.drawImage(img10,100,100,this);

			Font f1 = new Font("Arial",Font.BOLD,250);
	        g.setFont(f1);

	        Color c= new Color(218,5,37);
            g.setColor(c);
	        g.drawString("J",800,250);
	        g.drawString("for",800,500);
	        g.drawString("JUG",800,800);
		}
	    if(k==1)
		{
			g.drawImage(img11,100,100,this);

			Font f1 = new Font("Arial",Font.BOLD,250);
	        g.setFont(f1);

	        Color c= new Color(24,169,231);
            g.setColor(c);
	        g.drawString("K",800,250);
	        g.drawString("for",800,500);
	        g.drawString("KITE",800,800);
		}
		if(l==1)
		{
			g.drawImage(img12,100,100,this);

			Font f1 = new Font("Arial",Font.BOLD,250);
	        g.setFont(f1);

	        Color c= new Color(230,115,0);
            g.setColor(c);
	        g.drawString("L",800,250);
	        g.drawString("for",800,500);
	        g.drawString("LION",800,800);
		}
		if(m==1)
		{
			g.drawImage(img13,100,100,this);

			Font f1 = new Font("Arial",Font.BOLD,215);
	        g.setFont(f1);

	        Color c= new Color(128,64,0);
            g.setColor(c);
	        g.drawString("M",735,250);
	        g.drawString("for",735,500);
	        g.drawString("MONKEY",735,800);
		}
		if(n==1)
		{
			g.drawImage(img14,100,100,this);

			Font f1 = new Font("Arial",Font.BOLD,250);
	        g.setFont(f1);

	        Color c= new Color(128,64,0);
            g.setColor(c);
	        g.drawString("N",800,250);
	        g.drawString("for",800,500);
	        g.drawString("NEST",800,800);
		}
		if(o==1)
		{
			g.drawImage(img15,100,100,this);

			Font f1 = new Font("Arial",Font.BOLD,250);
	        g.setFont(f1);

	        Color c= new Color(202,117,2);
            g.setColor(c);
	        g.drawString("O",800,250);
	        g.drawString("for",800,500);
	        g.drawString("OWL",800,800);
		}
		if(p==1)
		{
			g.drawImage(img16,100,100,this);

			Font f1 = new Font("Arial",Font.BOLD,220);
	        g.setFont(f1);

	        Color c= new Color(0,191,0);
            g.setColor(c);
	        g.drawString("P",750,250);
	        g.drawString("for",750,500);
	        g.drawString("PARROT",750,800);
		}
		if(q==1)
		{
			g.drawImage(img17,100,100,this);

			Font f1 = new Font("Arial",Font.BOLD,240);
	        g.setFont(f1);

	        Color c= new Color(0,118,236);
            g.setColor(c);
	        g.drawString("Q",750,250);
	        g.drawString("for",750,500);
	        g.drawString("QUEEN",750,800);
		}
		if(r==1)
		{
			g.drawImage(img18,100,100,this);

			Font f1 = new Font("Arial",Font.BOLD,230);
	        g.setFont(f1);

	        Color c= new Color(255,108,182);
            g.setColor(c);
	        g.drawString("R",765,250);
	        g.drawString("for",765,500);
	        g.drawString("RABBIT",765,800);
		}
		if(s==1)
		{
			g.drawImage(img19,100,100,this);

			Font f1 = new Font("Arial",Font.BOLD,250);
	        g.setFont(f1);

	        Color c= new Color(227,74,0);
            g.setColor(c);
	        g.drawString("S",800,250);
	        g.drawString("for",800,500);
	        g.drawString("SHIP",800,800);
		}
		if(t==1)
		{
			g.drawImage(img20,100,100,this);

			Font f1 = new Font("Arial",Font.BOLD,200);
	        g.setFont(f1);

	        Color c= new Color(0,0,208);
            g.setColor(c);
	        g.drawString("T",740,250);
	        g.drawString("for",740,500);
	        g.drawString("TELEVISION",670,800);
		}
		if(u==1)
		{
			g.drawImage(img21,100,100,this);

			Font f1 = new Font("Arial",Font.BOLD,200);
	        g.setFont(f1);

	        Color c= new Color(136,0,136);
            g.setColor(c);
	        g.drawString("U",780,250);
	        g.drawString("for",780,500);
	        g.drawString("UMBRELLA",780,800);
		}
		if(v==1)
		{
			g.drawImage(img22,100,100,this);

			Font f1 = new Font("Arial",Font.BOLD,250);
	        g.setFont(f1);

	        Color c= new Color(253,6,209);
            g.setColor(c);
	        g.drawString("V",815,250);
	        g.drawString("for",815,500);
	        g.drawString("VAN",815,800);
		}
		if(w==1)
		{
			g.drawImage(img23,100,100,this);

			Font f1 = new Font("Arial",Font.BOLD,240);
	        g.setFont(f1);

	        Color c= new Color(0,112,249);
            g.setColor(c);
	        g.drawString("W",780,250);
	        g.drawString("for",780,500);
	        g.drawString("WHALE",780,800);
		}
		if(x==1)
		{
			g.drawImage(img24,100,100,this);

			Font f1 = new Font("Arial",Font.BOLD,210);
	        g.setFont(f1);

	        Color c= new Color(0,155,0);
            g.setColor(c);
	        g.drawString("X",730,250);
	        g.drawString("for",730,500);
	        g.drawString("Xmas TREE",730,800);
		}
		if(y==1)
		{
			g.drawImage(img25,100,100,this);

			Font f1 = new Font("Arial",Font.BOLD,250);
	        g.setFont(f1);

	        Color c= new Color(216,154,10);
            g.setColor(c);
	        g.drawString("Y",800,250);
	        g.drawString("for",800,500);
	        g.drawString("YAK",800,800);
		}
		if(z==1)
		{
			g.drawImage(img26,100,100,this);

			Font f1 = new Font("Arial",Font.BOLD,210);
	        g.setFont(f1);

	        Color c= new Color(66,66,66);
            g.setColor(c);
	        g.drawString("Z",750,250);
	        g.drawString("for",750,500);
	        g.drawString("ZEBRA",750,800);
		}

     }

	public void actionPerformed(ActionEvent e)
	{
		

	 if(e.getSource()==b1)
	 {
	   	a=1;
	   	b=0;
	   	c=0;
	   	d=0;
	   	e1=0;
	   	f=0;
	   	g2=0;
	   	h=0;
	   	i=0;
	   	j=0;
	   	k=0;
	   	l=0;
	   	m=0;
	   	n=0;
	   	o=0;
	   	p=0;
	   	q=0;
	   	r=0;
	   	s=0;
	   	t=0;
	   	u=0;
	   	v=0;
	   	w=0;
	   	x=0;
	   	y=0;
	   	z=0;
	   	
	   	repaint();
	 }

     if(e.getSource()==b2)
     {
     	a=0;
     	b=1;
     	c=0;
     	d=0;
	   	e1=0;
	   	f=0;
	   	g2=0;
	   	h=0;
	   	i=0;
	   	j=0;
	   	k=0;
	   	l=0;
	   	m=0;
	   	n=0;
	   	o=0;
	   	p=0;
	   	q=0;
	   	r=0;
	   	s=0;
	   	t=0;
	   	u=0;
	   	v=0;
	   	w=0;
	   	x=0;
	   	y=0;
	   	z=0;
     	repaint();
     }

     if(e.getSource()==b3)
     {
     	a=0;
     	b=0;
     	c=1;
     	d=0;
	   	e1=0;
	   	f=0;
	   	g2=0;
	   	h=0;
	   	i=0;
	   	j=0;
	   	k=0;
	   	l=0;
	   	m=0;
	   	n=0;
	   	o=0;
	   	p=0;
	   	q=0;
	   	r=0;
	   	s=0;
	   	t=0;
	   	u=0;
	   	v=0;
	   	w=0;
	   	x=0;
	   	y=0;
	   	z=0;
     	repaint();
       }

      if(e.getSource()==b4)
      {
      	a=0;
     	b=0;
     	c=0;
     	d=1;
	   	e1=0;
	   	f=0;
	   	g2=0;
	   	h=0;
	   	i=0;
	   	j=0;
	   	k=0;
	   	l=0;
	   	m=0;
	   	n=0;
	   	o=0;
	   	p=0;
	   	q=0;
	   	r=0;
	   	s=0;
	   	t=0;
	   	u=0;
	   	v=0;
	   	w=0;
	   	x=0;
	   	y=0;
	   	z=0;
     	repaint();
      }

      if(e.getSource()==b5)
      {
      	a=0;
     	b=0;
     	c=0;
     	d=0;
	   	e1=1;
	   	f=0;
	   	g2=0;
	   	h=0;
	   	i=0;
	   	j=0;
	   	k=0;
	   	l=0;
	   	m=0;
	   	n=0;
	   	o=0;
	   	p=0;
	   	q=0;
	   	r=0;
	   	s=0;
	   	t=0;
	   	u=0;
	   	v=0;
	   	w=0;
	   	x=0;
	   	y=0;
	   	z=0;
     	repaint();
      }

      if(e.getSource()==b6)
      {
      	a=0;
     	b=0;
     	c=0;
     	d=0;
	   	e1=0;
	   	f=1;
	   	g2=0;
	   	h=0;
	   	i=0;
	   	j=0;
	   	k=0;
	   	l=0;
	   	m=0;
	   	n=0;
	   	o=0;
	   	p=0;
	   	q=0;
	   	r=0;
	   	s=0;
	   	t=0;
	   	u=0;
	   	v=0;
	   	w=0;
	   	x=0;
	   	y=0;
	   	z=0;
     	repaint();
      }

      if(e.getSource()==b7)
      {
      	a=0;
     	b=0;
     	c=0;
     	d=0;
	   	e1=0;
	   	f=0;
	   	g2=1;
	   	h=0;
	   	i=0;
	   	j=0;
	   	k=0;
	   	l=0;
	   	m=0;
	   	n=0;
	   	o=0;
	   	p=0;
	   	q=0;
	   	r=0;
	   	s=0;
	   	t=0;
	   	u=0;
	   	v=0;
	   	w=0;
	   	x=0;
	   	y=0;
	   	z=0;
     	repaint();
      }

      if(e.getSource()==b8)
      {
      	a=0;
     	b=0;
     	c=0;
     	d=0;
	   	e1=0;
	   	f=0;
	   	g2=0;
	   	h=1;
	   	i=0;
	   	j=0;
	   	k=0;
	   	l=0;
	   	m=0;
	   	n=0;
	   	o=0;
	   	p=0;
	   	q=0;
	   	r=0;
	   	s=0;
	   	t=0;
	   	u=0;
	   	v=0;
	   	w=0;
	   	x=0;
	   	y=0;
	   	z=0;
     	repaint();
      }

      if(e.getSource()==b9)
      {
        a=0;
     	b=0;
     	c=0;
     	d=0;
	   	e1=0;
	   	f=0;
	   	g2=0;
	   	h=0;
	   	i=1;
	   	j=0;
	   	k=0;
	   	l=0;
	   	m=0;
	   	n=0;
	   	o=0;
	   	p=0;
	   	q=0;
	   	r=0;
	   	s=0;
	   	t=0;
	   	u=0;
	   	v=0;
	   	w=0;
	   	x=0;
	   	y=0;
	   	z=0;
     	repaint();
      }

      if(e.getSource()==b10)
      {
      	a=0;
     	b=0;
     	c=0;
     	d=0;
	   	e1=0;
	   	f=0;
	   	g2=0;
	   	h=0;
	   	i=0;
	   	j=1;
	   	k=0;
	   	l=0;
	   	m=0;
	   	n=0;
	   	o=0;
	   	p=0;
	   	q=0;
	   	r=0;
	   	s=0;
	   	t=0;
	   	u=0;
	   	v=0;
	   	w=0;
	   	x=0;
	   	y=0;
	   	z=0;
     	repaint();
      }

      if(e.getSource()==b11)
     {
     	a=0;
     	b=0;
     	c=0;
     	d=0;
	   	e1=0;
	   	f=0;
	   	g2=0;
	   	h=0;
	   	i=0;
	   	j=0;
	   	k=1;
	   	l=0;
	   	m=0;
	   	n=0;
	   	o=0;
	   	p=0;
	   	q=0;
	   	r=0;
	   	s=0;
	   	t=0;
	   	u=0;
	   	v=0;
	   	w=0;
	   	x=0;
	   	y=0;
	   	z=0;
     	repaint();
       }

       if(e.getSource()==b12)
     {
     	a=0;
     	b=0;
     	c=0;
     	d=0;
	   	e1=0;
	   	f=0;
	   	g2=0;
	   	h=0;
	   	i=0;
	   	j=0;
	   	k=0;
	   	l=1;
	   	m=0;
	   	n=0;
	   	o=0;
	   	p=0;
	   	q=0;
	   	r=0;
	   	s=0;
	   	t=0;
	   	u=0;
	   	v=0;
	   	w=0;
	   	x=0;
	   	y=0;
	   	z=0;
     	repaint();
       }

       if(e.getSource()==b13)
     {
     	a=0;
     	b=0;
     	c=0;
     	d=0;
	   	e1=0;
	   	f=0;
	   	g2=0;
	   	h=0;
	   	i=0;
	   	j=0;
	   	k=0;
	   	l=0;
	   	m=1;
	   	n=0;
	   	o=0;
	   	p=0;
	   	q=0;
	   	r=0;
	   	s=0;
	   	t=0;
	   	u=0;
	   	v=0;
	   	w=0;
	   	x=0;
	   	y=0;
	   	z=0;
     	repaint();
       }

       if(e.getSource()==b14)
     {
     	a=0;
     	b=0;
     	c=0;
     	d=0;
	   	e1=0;
	   	f=0;
	   	g2=0;
	   	h=0;
	   	i=0;
	   	j=0;
	   	k=0;
	   	l=0;
	   	m=0;
	   	n=1;
	   	o=0;
	   	p=0;
	   	q=0;
	   	r=0;
	   	s=0;
	   	t=0;
	   	u=0;
	   	v=0;
	   	w=0;
	   	x=0;
	   	y=0;
	   	z=0;
     	repaint();
       }

       if(e.getSource()==b15)
     {
     	a=0;
     	b=0;
     	c=0;
     	d=0;
	   	e1=0;
	   	f=0;
	   	g2=0;
	   	h=0;
	   	i=0;
	   	j=0;
	   	k=0;
	   	l=0;
	   	m=0;
	   	n=0;
	   	o=1;
	   	p=0;
	   	q=0;
	   	r=0;
	   	s=0;
	   	t=0;
	   	u=0;
	   	v=0;
	   	w=0;
	   	x=0;
	   	y=0;
	   	z=0;
     	repaint();
       }

       if(e.getSource()==b16)
     {
     	a=0;
     	b=0;
     	c=0;
     	d=0;
	   	e1=0;
	   	f=0;
	   	g2=0;
	   	h=0;
	   	i=0;
	   	j=0;
	   	k=0;
	   	l=0;
	   	m=0;
	   	n=0;
	   	o=0;
	   	p=1;
	   	q=0;
	   	r=0;
	   	s=0;
	   	t=0;
	   	u=0;
	   	v=0;
	   	w=0;
	   	x=0;
	   	y=0;
	   	z=0;
     	repaint();
       }

       if(e.getSource()==b17)
     {
     	a=0;
     	b=0;
     	c=0;
     	d=0;
	   	e1=0;
	   	f=0;
	   	g2=0;
	   	h=0;
	   	i=0;
	   	j=0;
	   	k=0;
	   	l=0;
	   	m=0;
	   	n=0;
	   	o=0;
	   	p=0;
	   	q=1;
	   	r=0;
	   	s=0;
	   	t=0;
	   	u=0;
	   	v=0;
	   	w=0;
	   	x=0;
	   	y=0;
	   	z=0;
     	repaint();
       }

       if(e.getSource()==b18)
     {
     	a=0;
     	b=0;
     	c=0;
     	d=0;
	   	e1=0;
	   	f=0;
	   	g2=0;
	   	h=0;
	   	i=0;
	   	j=0;
	   	k=0;
	   	l=0;
	   	m=0;
	   	n=0;
	   	o=0;
	   	p=0;
	   	q=0;
	   	r=1;
	   	s=0;
	   	t=0;
	   	u=0;
	   	v=0;
	   	w=0;
	   	x=0;
	   	y=0;
	   	z=0;
     	repaint();
       }

       if(e.getSource()==b19)
     {
     	a=0;
     	b=0;
     	c=0;
     	d=0;
	   	e1=0;
	   	f=0;
	   	g2=0;
	   	h=0;
	   	i=0;
	   	j=0;
	   	k=0;
	   	l=0;
	   	m=0;
	   	n=0;
	   	o=0;
	   	p=0;
	   	q=0;
	   	r=0;
	   	s=1;
	   	t=0;
	   	u=0;
	   	v=0;
	   	w=0;
	   	x=0;
	   	y=0;
	   	z=0;
     	repaint();
       }

       if(e.getSource()==b20)
     {
     	a=0;
     	b=0;
     	c=0;
     	d=0;
	   	e1=0;
	   	f=0;
	   	g2=0;
	   	h=0;
	   	i=0;
	   	j=0;
	   	k=0;
	   	l=0;
	   	m=0;
	   	n=0;
	   	o=0;
	   	p=0;
	   	q=0;
	   	r=0;
	   	s=0;
	   	t=1;
	   	u=0;
	   	v=0;
	   	w=0;
	   	x=0;
	   	y=0;
	   	z=0;
     	repaint();
       }

       if(e.getSource()==b21)
     {
     	a=0;
     	b=0;
     	c=0;
     	d=0;
	   	e1=0;
	   	f=0;
	   	g2=0;
	   	h=0;
	   	i=0;
	   	j=0;
	   	k=0;
	   	l=0;
	   	m=0;
	   	n=0;
	   	o=0;
	   	p=0;
	   	q=0;
	   	r=0;
	   	s=0;
	   	t=0;
	   	u=1;
	   	v=0;
	   	w=0;
	   	x=0;
	   	y=0;
	   	z=0;
     	repaint();
       }

       if(e.getSource()==b22)
     {
     	a=0;
     	b=0;
     	c=0;
     	d=0;
	   	e1=0;
	   	f=0;
	   	g2=0;
	   	h=0;
	   	i=0;
	   	j=0;
	   	k=0;
	   	l=0;
	   	m=0;
	   	n=0;
	   	o=0;
	   	p=0;
	   	q=0;
	   	r=0;
	   	s=0;
	   	t=0;
	   	u=0;
	   	v=1;
	   	w=0;
	   	x=0;
	   	y=0;
	   	z=0;
     	repaint();
       }

       if(e.getSource()==b23)
     {
     	a=0;
     	b=0;
     	c=0;
     	d=0;
	   	e1=0;
	   	f=0;
	   	g2=0;
	   	h=0;
	   	i=0;
	   	j=0;
	   	k=0;
	   	l=0;
	   	m=0;
	   	n=0;
	   	o=0;
	   	p=0;
	   	q=0;
	   	r=0;
	   	s=0;
	   	t=0;
	   	u=0;
	   	v=0;
	   	w=1;
	   	x=0;
	   	y=0;
	   	z=0;
     	repaint();
       }

       if(e.getSource()==b24)
     {
     	a=0;
     	b=0;
     	c=0;
     	d=0;
	   	e1=0;
	   	f=0;
	   	g2=0;
	   	h=0;
	   	i=0;
	   	j=0;
	   	k=0;
	   	l=0;
	   	m=0;
	   	n=0;
	   	o=0;
	   	p=0;
	   	q=0;
	   	r=0;
	   	s=0;
	   	t=0;
	   	u=0;
	   	v=0;
	   	w=0;
	   	x=1;
	   	y=0;
	   	z=0;
     	repaint();
       }

       if(e.getSource()==b25)
     {
     	a=0;
     	b=0;
     	c=0;
     	d=0;
	   	e1=0;
	   	f=0;
	   	g2=0;
	   	h=0;
	   	i=0;
	   	j=0;
	   	k=0;
	   	l=0;
	   	m=0;
	   	n=0;
	   	o=0;
	   	p=0;
	   	q=0;
	   	r=0;
	   	s=0;
	   	t=0;
	   	u=0;
	   	v=0;
	   	w=0;
	   	x=0;
	   	y=1;
	   	z=0;
     	repaint();
       }

       if(e.getSource()==b26)
     {
     	a=0;
     	b=0;
     	c=0;
     	d=0;
	   	e1=0;
	   	f=0;
	   	g2=0;
	   	h=0;
	   	i=0;
	   	j=0;
	   	k=0;
	   	l=0;
	   	m=0;
	   	n=0;
	   	o=0;
	   	p=0;
	   	q=0;
	   	r=0;
	   	s=0;
	   	t=0;
	   	u=0;
	   	v=0;
	   	w=0;
	   	x=0;
	   	y=0;
	   	z=1;
     	repaint();
       }
    }
}	

/*<applet code=child_board width=400 height=400>
</applet>*/
