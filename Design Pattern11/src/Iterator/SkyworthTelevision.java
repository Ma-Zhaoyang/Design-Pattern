package Iterator;

public class SkyworthTelevision implements Television{

	private Object[] obj = {"CCTV-1","CCTV-2","CCTV-3"};

	@Override
	public TVIterator createITerator() {
		// TODO Auto-generated method stub
		return new SkyworthIterator();
	}
	
	private class SkyworthIterator implements TVIterator{
		private int currentIndex = 0;

		@Override
		public void setChannel(int i) {
			// TODO Auto-generated method stub
			currentIndex = i;
		}

		@Override
		public void next() {
			// TODO Auto-generated method stub
			if(currentIndex < obj.length) {
				currentIndex++;
			}
		}

		@Override
		public void presious() {
			// TODO Auto-generated method stub
			if (currentIndex > 0 ) {
				currentIndex--;
			}
		}

		@Override
		public boolean isLast() {
			// TODO Auto-generated method stub
			return currentIndex == obj.length;
		}

		@Override
		public Object currentChannel() {
			// TODO Auto-generated method stub
			return obj[currentIndex];
		}

		@Override
		public boolean isFirst() {
			// TODO Auto-generated method stub
			return currentIndex == 0;
		}
		
		
	}
}
