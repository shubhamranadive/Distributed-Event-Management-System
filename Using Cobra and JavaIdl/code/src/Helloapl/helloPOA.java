package Helloapl;


/**
* Helloapl/helloPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/estaf/.eclipse/eclipse-workspace/dsd/src/hello.idl
* Sunday, July 7, 2019 10:36:54 o'clock PM EDT
*/

public abstract class helloPOA extends org.omg.PortableServer.Servant
 implements Helloapl.helloOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("sayhello", new java.lang.Integer (0));
    _methods.put ("addEvent", new java.lang.Integer (1));
    _methods.put ("removeEvent", new java.lang.Integer (2));
    _methods.put ("listEventAvailability", new java.lang.Integer (3));
    _methods.put ("bookEvent", new java.lang.Integer (4));
    _methods.put ("getBookingSchedule", new java.lang.Integer (5));
    _methods.put ("cancelEvent", new java.lang.Integer (6));
    _methods.put ("swapEvent", new java.lang.Integer (7));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // Helloapl/hello/sayhello
       {
         String $result = null;
         $result = this.sayhello ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 1:  // Helloapl/hello/addEvent
       {
         String managerID = in.read_string ();
         String eventID = in.read_string ();
         String eventType = in.read_string ();
         int bookingCapacity = in.read_long ();
         String $result = null;
         $result = this.addEvent (managerID, eventID, eventType, bookingCapacity);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 2:  // Helloapl/hello/removeEvent
       {
         String eventID = in.read_string ();
         String eventType = in.read_string ();
         String $result = null;
         $result = this.removeEvent (eventID, eventType);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 3:  // Helloapl/hello/listEventAvailability
       {
         String eventType = in.read_string ();
         String $result = null;
         $result = this.listEventAvailability (eventType);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 4:  // Helloapl/hello/bookEvent
       {
         String customerID = in.read_string ();
         String eventID = in.read_string ();
         String eventType = in.read_string ();
         String $result = null;
         $result = this.bookEvent (customerID, eventID, eventType);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 5:  // Helloapl/hello/getBookingSchedule
       {
         String customerID = in.read_string ();
         String $result = null;
         $result = this.getBookingSchedule (customerID);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 6:  // Helloapl/hello/cancelEvent
       {
         String customerID = in.read_string ();
         String eventID = in.read_string ();
         String eventType = in.read_string ();
         String $result = null;
         $result = this.cancelEvent (customerID, eventID, eventType);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 7:  // Helloapl/hello/swapEvent
       {
         String customerID = in.read_string ();
         String newEventID = in.read_string ();
         String newEventType = in.read_string ();
         String oldEventID = in.read_string ();
         String oldEventType = in.read_string ();
         String $result = null;
         $result = this.swapEvent (customerID, newEventID, newEventType, oldEventID, oldEventType);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Helloapl/hello:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public hello _this() 
  {
    return helloHelper.narrow(
    super._this_object());
  }

  public hello _this(org.omg.CORBA.ORB orb) 
  {
    return helloHelper.narrow(
    super._this_object(orb));
  }


} // class helloPOA
