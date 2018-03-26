package edu.ben.labs.lab6;

import java.util.Collection;
import java.util.NoSuchElementException;

/**
 * 
 * @author maazfitter
 *
 * @param <E>
 */
public interface MyLinkedListInterface<E> {
/**
* Inserts the specified element at the specified position in this list.
* Shifts the element currently at that position (if any) and any subsequent
* elements to the right (adds one to their indices).
*
* @param index
* index at which the specified element is to be inserted
* @param o
* element to be inserted
* @throws IndexOutOfBoundsException
* if the index is out of range (index < 0 || index > size())
*/
void add(int index, E o) throws IndexOutOfBoundsException;

/**
* Appends the specified element to the end of this list.
*
* @param o
* element to be inserted
*/
void add(E o);

/**
* Inserts all of the elements in the specified collection into this list,
* starting at the specified position. Shifts the element currently at that
* position (if any) and any subsequent elements to the right (increases
* their indices). The new elements will appear in the list in the order
* that they are returned by the specified collection's iterator.
*
* @param index
* @param c
* collection containing elements to be added to this list
* @return true if this list changed as a result of the call
* @throws IndexOutOfBoundsException
* if the index is out of range (index < 0 || index > size())
* @throws NullPointerException
* if the specified collection is null
*/
boolean addAll(int index, Collection<? extends E> c) throws IndexOutOfBoundsException, NullPointerException;

/**
* Inserts all of the elements in the specified collection into this list
*
* @param c
* collection containing elements to be added to this list
* @return true if this list changed as a result of the call
* @throws NullPointerException
* if the specified collection is null
*/
boolean addAll(Collection<? extends E> c) throws NullPointerException;

/**
* Inserts the specified element at the beginning of this list.
*
* @param o
*/
void addFirst(E o);

/**
* F Appends the specified element to the end of this list.
*
* @param o
*/
void addLast(E o);

/**
* Removes all of the elements from this list.
*/
void clear();

/**
* Returns true if this list contains the specified element.
*
* @param o
* @return
*/
boolean contains(E o);

/**
* Returns the element at the specified position in this list.
*
* @param index
* @return the element at the specified position in this list
* @throws IndexOutOfBoundsException
* if the index is out of range (index < 0 || index >= size())
*/
E get(int index) throws IndexOutOfBoundsException;

/**
* Returns the first element in this list.
*
* @return
*/
E getFirst();

/**
* NOT NORMALLY IMPLEMENTED AS THIS WILL EXPOSE OUR LIST. ONLY HERE FOR
* PURPOSES OF THIS ASSIGNMENT.
*
* Returns the head of the list.
*
* @return
*/
Node getHead();

/**
* Returns the last element in this list.
*
* @return the last element in this list
* @throws NoSuchElementException
* if this list is empty
*/
E getLast() throws NoSuchElementException;

/**
* Returns the number of elements in this list.
*
* @return
*/
int getSize();

/**
* Returns the index of the first occurrence of the specified element in
* this list, or -1 if this list does not contain the element. More
* formally, returns the lowest index i such that (o==null ? get(i)==null :
* o.equals(get(i))), or -1 if there is no such index.
*
* @param o
* @return the index of the first occurrence of the specified element in
* this list, or -1 if this list does not contain the element
*/
int indexOf(E o);

/**
* Return true if the list is empty, false otherwise
*
* @return
*/
boolean isEmpty();

/**
* Returns the index of the last occurrence of the specified element in this
* list, or -1 if this list does not contain the element. More formally,
* returns the highest index i such that (o==null ? get(i)==null :
* o.equals(get(i))), or -1 if there is no such index.
*
* @param o
* @return the index of the last occurrence of the specified element in this
* list, or -1 if this list does not contain the element
*/
int lastIndexOf(E o);

/**
* Retrieves, but does not remove, the head (first element) of this list.
*
* @return
*/
E peek();

/**
* Retrieves, but does not remove, the last element of this list, or returns
* null if this list is empty.
*
* @return
*/
E peekLast();

/**
* Retrieves and removes the head (first element) of this list.
*
* @return The first element of the list, null if empty
* @throws if
* this list is empty
*/
E remove() throws NoSuchElementException;

/**
* Removes and returns the last element from this list.
*
* @return The last element of the list
* @throws if
* this list is empty
*/
E removeLast() throws NoSuchElementException;

/**
* <div class="block">Returns an array containing all of the elements in
* this list in proper sequence (from first to last element); the runtime
* type of the returned array is that of the specified array. If the list
* fits in the specified array, it is returned therein. Otherwise, a new
* array is allocated with the runtime type of the specified array and the
* size of this list.
*
* <p>
* If the list fits in the specified array with room to spare (i.e., the
* array has more elements than the list), the element in the array
* immediately following the end of the list is set to <code>null</code>.
* (This is useful in determining the length of the list <i>only</i> if the
* caller knows that the list does not contain any null elements.)
*
* </p>
* <p>
* Like the <a href="../../java/util/LinkedList.html#toArray()">
* <code>toArray()</code></a> method, this method acts as bridge between
* array-based and collection-based APIs. Further, this method allows
* precise control over the runtime type of the output array, and may, under
* certain circumstances, be used to save allocation costs.
*
* </p>
* <p>
* Suppose <code>x</code> is a list known to contain only strings. The
* following code can be used to dump the list into a newly allocated array
* of <code>String</code>:
*
* </p>
*
* <pre>
* String[] y = x.toArray(new String[0]);
* </pre>
*
* Note that <code>toArray(new Object[0])</code> is identical in function to
* <code>toArray()</code>.</div>
*
* @return An array representation of the list or an empty array if list is
* empty
* @throws NullPointerException
* if the specified array is null
*/
E[] toArray();

/**
* Returns a string representation of the Linked List Data Structure in the
* following form: "List = [<i>value1, value2, value3</i>]"
*
* @return A string representing the linked list
*/
@Override
String toString();
}