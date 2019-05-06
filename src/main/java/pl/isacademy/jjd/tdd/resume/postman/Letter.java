package pl.isacademy.jjd.tdd.resume.postman;

public class Letter {
    private Address sender;

    private Address receiver;

    private Envelope size;

    Letter(Address sender, Address receiver, Envelope size) {
        this.sender = sender;
        this.receiver = receiver;
        this.size = size;
    }

    Letter() {
    }

    public Address getSender() {
        return this.sender;
    }

    public Address getReceiver() {
        return this.receiver;
    }

    public Envelope getSize() {
        return this.size;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Letter)) return false;
        final Letter other = (Letter) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$sender = this.getSender();
        final Object other$sender = other.getSender();
        if (this$sender == null ? other$sender != null : !this$sender.equals(other$sender)) return false;
        final Object this$receiver = this.getReceiver();
        final Object other$receiver = other.getReceiver();
        if (this$receiver == null ? other$receiver != null : !this$receiver.equals(other$receiver)) return false;
        final Object this$size = this.getSize();
        final Object other$size = other.getSize();
        if (this$size == null ? other$size != null : !this$size.equals(other$size)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $sender = this.getSender();
        result = result * PRIME + ($sender == null ? 43 : $sender.hashCode());
        final Object $receiver = this.getReceiver();
        result = result * PRIME + ($receiver == null ? 43 : $receiver.hashCode());
        final Object $size = this.getSize();
        result = result * PRIME + ($size == null ? 43 : $size.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Letter;
    }
}
