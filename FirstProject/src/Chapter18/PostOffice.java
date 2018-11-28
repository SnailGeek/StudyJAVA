package Chapter18;

import java.util.*;

import com.sun.org.apache.regexp.internal.RE;
import net.mindview.util.*;
import static net.mindview.util.Print.*;
import static Chapter18.MailHandler.*;

class Mail
{
    enum GeneralDelivery{YES, NO1, NO2, NO3, NO4, NO5}
    enum Scannability{UNSCANNABLE, YES1, YES2, YES3, YES4}
    enum Readability{ILLEGIBLE,  YES1, YES2, YES3, YES4}
    enum Address{INCORRECT,OK1,OK2,OK3,OK4,OK5,OK6}
    enum ReturnAddress{MISSING,OK1,OK2,OK3,OK4,OK5}
    enum Transmit{YES,NO1, NO2, NO3, NO4, NO5}
    GeneralDelivery generalDelivery;
    Scannability scannability;
    Readability readability;
    Address address;
    ReturnAddress returnAddress;
    Transmit transmit;
    static long counter = 0;
    long id = counter++;
    public String toString()
    {
        return "Mail " + id;
    }
    public String details()
    {
        return toString() + " General Delivery: " + generalDelivery +
                ", Address Scanability: " + scannability +
                ", Address Readability: " + readability +
                ", Address Address: " + address +
                ", Return Address: " + returnAddress +
                ", Transmit: " + transmit;
    }
    public static Mail randomMail()
    {
        Mail m = new Mail();
        m.generalDelivery = Enums.random(GeneralDelivery.class);
        m.scannability = Enums.random(Scannability.class);
        m.readability = Enums.random(Readability.class);
        m.address = Enums.random(Address.class);
        m.returnAddress =Enums.random(ReturnAddress.class);
        m.transmit = Enums.random(Transmit.class);
        return  m;
    }
    public static Iterable<Mail> generator(final int count)
    {
        return new Iterable<Mail>() {
            int n = count;
            @Override
            public Iterator<Mail> iterator() {
                return new Iterator<Mail>() {
                    @Override
                    public boolean hasNext() {
                        return n-- > 0;
                    }
                    @Override
                    public Mail next() {
                        return randomMail();
                    }
                    public void remove()
                    {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
}

public class PostOffice
{
//    enum MailHandler
//    {
//        GENERAL_DELIVERY
//                {
//                    boolean handle(Mail m)
//                    {
//                        switch (m.generalDelivery)
//                        {
//                            case YES:
//                                print("Using general delivery for" + m);
//                                return true;
//                            default:
//                                return false;
//                        }
//                    }
//                },
//        MACHINE_SCAN
//                {
//                    boolean handle(Mail m)
//                    {
//                        switch (m.scannability)
//                        {
//                            case UNSCANNABLE: return false;
//                            default:
//                                switch (m.address)
//                                {
//                                    case INCORRECT:return false;
//                                    default:
//                                        print("Delivering " + m + " automatically");
//                                        return true;
//                                }
//                        }
//                    }
//                },
//        VISUAL_INSPECTION
//                {
//                    boolean handle(Mail m)
//                    {
//                        switch (m.readability)
//                        {
//                            case ILLEGIBLE:return  false;
//                            default:
//                                switch (m.address)
//                                {
//                                    case INCORRECT: return false;
//                                    default:
//                                        print("Delivering " + m + "normally");
//                                        return true;
//                                }
//                        }
//                    }
//                },
//        RETURN_TO_SENDER
//                {
//                    boolean handle(Mail m)
//                    {
//                        switch (m.returnAddress)
//                        {
//                            case MISSING: return false;
//                            default:
//                                print("Returning " + m + " to sender");
//                                return true;
//                        }
//                    }
//                },
//        TRANSMIT_TO_OTHER
//                {
//                    boolean handle(Mail m)
//                    {
//                        switch (m.transmit)
//                        {
//                            case YES:
//                                print("Transmit success: " + m);
//                                return true;
//                            default: return false;
//                        }
//                    }
//
//                }
//                ;
//        abstract boolean handle(Mail m);
//    }

//    static void handle(Mail m)
//    {
//        for(MailHandler handler : MailHandler.values())
//            if(handler.handle(m))
//                return;
//        print(m + " si a dead letter");
//    }

    static EnumMap<MailHandler, Handle> em = new EnumMap<MailHandler, Handle>(MailHandler.class);
//    public enum MailHandler
//    {
//        GENERAL_DELIVERY, MACHINE_SCAN, VISUAL_INSPECTION,
//        RETURN_TO_SENDER, TRANSMIT_TO_OTHER
//    }
    PostOffice()
    {
        em.put(GENERAL_DELIVERY, new Handle() {
            @Override
            public boolean handle(Mail m) {
                switch (m.generalDelivery)
                {
                    case YES:
                        print("Using general delivery for" + m);
                        return true;
                    default:
                        return false;
                }
            }
        });
        em.put(MACHINE_SCAN, new Handle() {
            @Override
            public boolean handle(Mail m) {
                switch (m.scannability)
                {
                    case UNSCANNABLE: return false;
                    default:
                        switch (m.address)
                        {
                            case INCORRECT:return false;
                            default:
                                print("Delivering " + m + " automatically");
                                return true;
                        }
                }
            }
        });
        em.put(VISUAL_INSPECTION, new Handle() {
            @Override
            public boolean handle(Mail m) {
                switch (m.readability)
                {
                    case ILLEGIBLE:return  false;
                    default:
                        switch (m.address)
                        {
                            case INCORRECT: return false;
                            default:
                                print("Delivering " + m + "normally");
                                return true;
                        }
                }
            }
        });
        em.put(RETURN_TO_SENDER, new Handle() {
            @Override
            public boolean handle(Mail m) {
                switch (m.returnAddress)
                {
                    case MISSING: return false;
                    default:
                        print("Returning " + m + " to sender");
                        return true;
                }
            }
        });
        em.put(TRANSMIT_TO_OTHER, new Handle() {
            @Override
            public boolean handle(Mail m) {
                switch (m.transmit)
                {
                    case YES:
                        print("Transmit success: " + m);
                        return true;
                    default: return false;
                }
            }
        });

    }
    interface Handle{boolean handle(Mail m);}
    static void handle(Mail m)
    {
        for (Map.Entry<MailHandler, Handle> entry : em.entrySet())
        {
            entry.getValue().handle(m);
        }

    }
    public static void main(String[] args)
    {
        for (Mail m : Mail.generator(10))
        {
            print(m.details());
            handle(m);
            print("......................");
        }
    }

}
