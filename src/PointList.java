import java.util.*;


public class PointList {
	
	private static ArrayList<MyPoint> pList;
	private static MyPoint[] initialPoints;
	private static boolean pointsCalc = false;
	protected static int startPointCounter = 0;
	
	//private static Logger log = new Logger();
	
	public PointList(){
		pList = new ArrayList<MyPoint>();
		initialPoints = new MyPoint[3];
		
	}
	
	public static void add(MyPoint p){
		pList.add(p);
	}
	
	public static void reset(){
		startPointCounter = 0;
		pointsCalc = false;
	}
	
	public static void addStartPoint(MyPoint p){
		if(startPointCounter < 3){
			initialPoints[startPointCounter] = p;
			pList.add(p);
			startPointCounter++;
		}
		if(startPointCounter == 3){
			if(!pointsCalc){
				calculatePoints(10000);
				pointsCalc = true;
			}
		}
	}
	
	public static void clearPointList(){
		pList.clear();
	}
	
	// berechnet die folgenen Punkte um die Grafik anzuzeigen
	private static void calculatePoints(int countPoints){
		MyPoint pointNow = initialPoints[Util.my_rnd()];
		MyPoint tmp = initialPoints[Util.my_rnd()];
		int rnd = 0;
		
		//log.writeToLog("First init Point: " + initialPoints[0].x + ", " + initialPoints[0].y);
		//log.writeToLog("First init Point: " + initialPoints[1].x + ", " + initialPoints[1].y);
		//log.writeToLog("First init Point: " + initialPoints[2].x + ", " + initialPoints[2].y);
		
		
		for(int i = 0; i < countPoints; i++){
			rnd = Util.my_rnd();
			
			tmp = initialPoints[rnd];
			//log.writeToLog(Integer.toString(rnd) + " PN: " + pointNow.x + ", " + pointNow.y + " tmp: " + tmp.x + ", " + tmp.y);
			pointNow = getNewPoint(pointNow, tmp);
			
			pList.add(pointNow);
		}
		//log.close();
	}
	
	private static MyPoint getNewPoint(MyPoint origin, MyPoint p){
		MyPoint tmp = new MyPoint((origin.x + p.x)/2, (origin.y + p.y)/2);
		//log.writeToLog(tmp.x + ", " + tmp.y);
		return tmp;
	}
	
	public MyPoint getPoint(int index){
		if( !pList.isEmpty() ){
			return pList.get(index);
		}
		else return null;
	}
	
	public Iterator<MyPoint> iterator(){
		return this.pList.iterator();
	}
}
