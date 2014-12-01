package uk.ac.cam.hmd34.SupervisionWork3;

public class CollectionArrayList<E> extends java.util.AbstractList<E> {
	private E[] ArrayBackend;
	public int size(){
		return ArrayBackend.length;
		}
	public E get(int i){
		return ArrayBackend[i];
		}
	public void set(int i, E j){
		ArrayBackend[i] = j;
		}
	public void add(int i, E j){
		E[] f = E[(size() + 1)];
		for(int y = 0;y<i;y++){
			f[y]=ArrayBackend[y];
			}
		f[i] = j;
		for(int u = i+1;u<f.length;u++){
			f[u] = ArrayBackend[u-1];
			}
		ArrayBackend = f;
		}
	public void remove(int i){
		E[] f = E[(size() - 1)];
		for(int y = 0;y<i;y++){
			f[y]=ArrayBackend[y];
			}
		for(int u = i+1;u<f.length;u++){
			f[u] = ArrayBackend[u+1];
			}
		ArrayBackend = f;
		}
	}