package hw7;

import java.io.Serializable;

public interface Animal extends Serializable {
	public default void speak(){}
}
