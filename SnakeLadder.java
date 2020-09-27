import java.util.*;

public class SnakeLadder
{
	public static final int NO_PLAY=1;
	public static final int LADDER=2;
	public static final int SNAKE=3;

	public static void main(String args[])
	{
		int position=0;
		//System.out.println(Math.random()*5);
		int dieNumber=(int)(Math.random()*5)%7;
		System.out.println("Number when die rolled: "+dieNumber);

		int options=(int)(Math.random()*5)%4;

		switch (options) 
		{
			case NO_PLAY:	position=position+0;
							break;
			case LADDER:	position=position+dieNumber;
							break;
			case SNAKE:		position=position-dieNumber;
							break;
			default:		break;
		}

		System.out.println("Options: "+options);
		System.out.println("Current Die Postion: "+position);
	}
}