**Java MaP**

The Map interface is a part of the Java Collection Framework and is used to store key-value pairs. Each key must be unique, but values can be duplicated.

A Map is useful when you want to associate a key (like a name or ID) with a value (like an age or description).

Common classes that implement Map are:
- HashMap: fast and unordered
- TreeMap: sorted by key
- LinkedHashMap: ordered by insertion

<table>
<tr>
<th>Features</th>
<th>List</th>
<th>Set</th>
<th>Map</th>
</tr>
<tr>
<td>Duplicates Allowed</td>
<td>Yes</td>
<td>No</td>
<td>Keys: No \n
Values: Yes</td>
</tr>
<tr>
<td>Stores Key-Value Pairs?</td>
<td>No</td>
<td>No</td>
<td>Yes</td>
</tr>
<tr>
<td>Maintains Order?</td>
<td>Yes</td>
<td>No (Unless using TreeSet or LinkedHashSet</td>
<td>No (Unless using TreeSet or LinkedHashSet</td>
</tr>
</table>