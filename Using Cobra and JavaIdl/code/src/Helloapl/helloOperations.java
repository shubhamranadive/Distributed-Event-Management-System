package Helloapl;


/**
* Helloapl/helloOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/estaf/.eclipse/eclipse-workspace/dsd/src/hello.idl
* Sunday, July 7, 2019 10:36:54 o'clock PM EDT
*/

public interface helloOperations 
{
  String sayhello ();
  String addEvent (String managerID, String eventID, String eventType, int bookingCapacity);
  String removeEvent (String eventID, String eventType);
  String listEventAvailability (String eventType);
  String bookEvent (String customerID, String eventID, String eventType);
  String getBookingSchedule (String customerID);
  String cancelEvent (String customerID, String eventID, String eventType);
  String swapEvent (String customerID, String newEventID, String newEventType, String oldEventID, String oldEventType);
} // interface helloOperations
